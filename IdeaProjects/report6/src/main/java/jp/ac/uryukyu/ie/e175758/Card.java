package jp.ac.uryukyu.ie.e175758;
import java.util.*;
public class Card {
    public static boolean visible = true;
    public static Random random = new Random();
    public static int p,sum = 0;
    public static String a= null;
    public static int  getP() {
        return p;
    }
    public static String getA(){
        if (visible == false) {
            return "?";
        } else {
            return a;
        }
    }


    public static void Deal() {
        /**
         *トランプは各数字4まいずつしか存在しないが、ここでは4枚以上存在するとする。
         * @param a A,J,Q,Kなど引いたカードの表示
         * @param p 引いたトランプの数字
         * @param sum 引いたカードの合計
         */
        boolean visible = true;
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
                    } else {
                        a = String.valueOf(p);

                    }
                }
            }
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
        if (sum < 22) {
            for (int k = 0; k <= sum; k++) {
                if (p == 11) {
                    p = 1;
                    sum -= 10;
                }
            }
        }
    }
}

