package jp.ac.uryukyu.ie.e175758;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Player extends Card {
    static int sum = 0;
    static int i = 2;
    static int pa,pb,pc,pd,pe,pf,pg,ph,pi = 0;
    static String qa,qb,qc,qd,qe,qf,qg,qh,qi = null;
    static List<Integer> num = new ArrayList<Integer>();
    static List<String> list = new ArrayList<String>();

    public static void F_Deal() {
        Deal();
        pa = getP();
        qa = getA();
        Deal();
        pb = getP();
        qb = getA();
        sum = pa + pb;

        System.out.println("プレイヤーのカードは" + qa + "," + qb + "の合計" + sum + "です。");
    }

    public static void S_Deal() {
        System.out.println("この後の行動を選択してください。\n[]:Hit,[h以外]:Stay");
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
                sum += pc + pd + pe + pf + pg + ph + pi;
                System.out.println("プレイヤーの引いたカードは" + getA() + ",\n合計は" + sum + " です。");
            }
            if (sum > 21) {
                System.out.println("合計が" + sum + "でプレーヤーはBustしました");
            } else {
                System.out.println("プレイヤーのカードの合計は" + sum + "で確定しました。");
            }
        }
    }
}
