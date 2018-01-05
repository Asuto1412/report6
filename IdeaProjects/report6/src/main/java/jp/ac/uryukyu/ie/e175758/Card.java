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
        String[] a = new String[30];
        int[] c = new int[30];
        int p = 0;
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            p = random.nextInt(13) + 1;
            c[i] = p;
            if (c[i] == 11) {
                a[i] = "J";
            } else {
                if (c[i] == 12) {
                    a[i] = "Q";
                } else {
                    if (c[i] == 13) {
                        a[i] = "K";
                    } else {
                        if (c[i] == 1) {
                            a[i] = "A";
                        }
                    }
                }
            }
            String d = String.valueOf(p);
            a[i] = d;

            if (c[i] >= 10) {
                c[i] = 10;
            }
            if (c[i] >= 1) {
                c[i] = 11;
            }
            sum += c[i];
            if (sum >= 22) {
                for (int k = 0; k <= sum; k++) {
                    if (c[k] == 11) {
                        c[k] = 1;
                        sum -= 10;
                    }
                }
            }
        }
        for (int i = 2; sum < 22; i++) {
            System.out.println("現在の点数は" + a[1] + "と" + a[2] + "の合計" + sum + "です。");
        }
    }
}
