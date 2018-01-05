package jp.ac.uryukyu.ie.e175758;
import java.util.*;
public class Card {
    static Random random = new Random();
    boolean visible;

    public static void Card() {
        int num = random.nextInt(13) + 1;
        System.out.println(num);
    }

    public static void deal_first() {
        int num = random.nextInt(52);
        /**
         *トランプは各数字4まいずつしか存在しないが、ここでは4枚以上存在するとする。
         * @param c 引いたカードを収納場所
         * @param p トランプの数字
         * @param sum 引いたカードの合計
         */
        String a,c = null;
        String b = null;
        String d = null;
        int i,p,sum = 0;
        for (i = 0; i < 2; i++) {
            p = random.nextInt(13) + 1;
            //アルファベット表記に変更
            if (p == 11) {
                a = "J";
            } else {
                if (p == 12) {
                    a = "Q";
                } else {
                    if (p == 13) {
                        a = "K";
                    } else {
                        if (p == 1) {
                            a = "A";
                        }
                        d = String.valueOf(p);
                        a = d;
                    }
                }
            }
            if (i == 0) {
                b = a;
            } else {
                c = a;
            }
            //ブラックジャックでは10以上のカードを10と見るため値の変更
            if (p >= 10) {
                p = 10;
            }
            //ブラックジャックではAは1と11の役割を担うがここでは11としておく
            if (p == 1) {
                p = 11;
            }
            sum += p;
            //Aが手札にあり、合計が22を超えている場合、Aの値を1に変更
            if (sum >= 22) {
                for (int k = 0; k <= sum; k++) {
                    if (p == 11) {
                        p = 1;
                        sum -= 10;
                    }
                }
            }
        }
        for (i = 2; i < 3; i++) {
            System.out.println("現在の点数は" + b + "と" + c + "の合計" + sum + "です。");
        }
    }
}
