package jp.ac.uryukyu.ie.e175758;
import java.util.Scanner;
public class Player extends Card {
    static int i = 2;
    static int pa,pb,pc,pd,pe,pf,pg,ph,pi = 0;
    static String qa,qb,qc,qd,qe,qf,qg,qh,qi,qq = null;
    static int p_sum = sum;

    public static void F_Deal() {
        //Deal()を2回繰り返すことで2枚のカードを配る
        Deal();
        pa = getP();
        qa = getA();
        Deal();
        pb = getP();
        qb = getA();
        p_sum = pa + pb;

        System.out.println("プレイヤーのカードは" + qa + "," + qb + "の合計" + p_sum + "です。");
    }

    public static void S_Deal() {
        //プレイヤーにHITするかSTAYするかを選択してもらう
        System.out.println("この後の行動を選択してください。\n[h]:Hit,[h以外]:Stay");
        String input;
        try (Scanner in = new Scanner(System.in)) {
            input = in.nextLine();

            while (input.equals("h")) {
                Deal();
                i++;
                if (i == 2) {
                    pc = getP();
                    qc = getA();
                } else if (i == 3) {
                    pd = getP();
                    qd = getA();
                } else if (i == 4) {
                    pe = getP();
                    qe = getA();
                } else if (i == 5) {
                    pf = getP();
                    qf = getA();
                } else if (i == 6) {
                    pg = getP();
                    qg = getA();
                } else if (i == 7) {
                    ph = getP();
                    qh = getA();
                } else if (i == 8) {
                    pi = getP();
                    qi = getA();
                }
                p_sum += pc + pd + pe + pf + pg + ph + pi;
                System.out.println("プレイヤーの引いたカードは" + getA() + ",\n合計は" + p_sum + "です。");
                if (p_sum > 21) {
                    //Bustしたかどうかを判定する
                    System.out.println("プレイヤーはBustしました");
                    break;
                } else {
                    System.out.println("この後の行動を選択してください。\n[h]:Hit,[h以外]:Stay");
                    input = in.nextLine();
                }
            }
            System.out.println("プレイヤーのターンは終了しました。");
        }
    }
}
