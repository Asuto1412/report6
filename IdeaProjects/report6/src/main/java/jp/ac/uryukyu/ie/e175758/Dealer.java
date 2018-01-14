package jp.ac.uryukyu.ie.e175758;
import java.util.List;
import java.util.ArrayList;

public class Dealer extends Card {
    static int sum = 0;
    static int i = 2;
    static int pa,pb,pc,pd,pe,pf,pg,ph,pi = 0;
    static String qa,qb,qc,qd,qe,qf,qg,qh,qi,qq = null;
    static List<Integer> num = new ArrayList<Integer>();
    static List<String> list = new ArrayList<String>();

    public static void F_Deal() {
            Deal();
            qq = getA();
            visible = false;
            pa = getP();
            qa = getA();
            Deal();
            visible = true;
            pb = getP();
            qb = getA();
            sum = pb;
        System.out.println("ディーラーのカードは" + qa + "," + qb + "の合計" + sum + "です。");
    }

    public static void S_Deal() {
        visible = true;
        sum = pa + pb;
        System.out.println("ディーラーのカードをオープン！");
        System.out.println("ディーラーのカードは" + qq + "," + qb + "の合計" + sum + "です。");
        while ( sum <= 16 ) {
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
            System.out.println("ディーラーの引いたカードは" + getA() +",\n合計は" + sum + " です。");
        }
        if (sum > 21) {
            System.out.println("合計が" + sum + "でディーラーはBustしました");
        } else {
            System.out.println("ディーラーのカードの合計" + sum + "で確定しました。");
        }
    }
}

