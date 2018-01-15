package jp.ac.uryukyu.ie.e175758;

public class Dealer extends Card {
    static int i = 2;
    static int pa,pb,pc,pd,pe,pf,pg,ph,pi = 0;
    static String qa,qb,qc,qd,qe,qf,qg,qh,qi,qq = null;
    static int d_sum = sum;
    public static void F_Deal() {
        //Deal()を2回繰り返すことで2枚のカードを配る
        Deal();
        qq = getA();
        //ディーラーに配られるカードの１枚目は裏返した状態で配る
        visible = false;
        pa = getP();
        qa = getA();
        Deal();
        visible = true;
        pb = getP();
        qb = getA();
        d_sum = pb;
        System.out.println("ディーラーのカードは" + qa + "," + qb + "の合計" + d_sum + "です。");
    }

    public static void S_Deal() {
        d_sum = pa + pb;
        System.out.println("ディーラーのカードをオープン！");
        //ここでディーラーの最初に配られたカードを2枚とも表にする。
        System.out.println("ディーラーのカードは" + qq + "," + qb + "の合計" + d_sum + "です。");
        //ディーラーはカード合計が16以下の時は必ずHITしなければいけない
        while ( d_sum <= 16 ) {
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
            d_sum += pc + pd + pe + pf + pg + ph + pi;
            System.out.println("ディーラーの引いたカードは" + getA() +",\n合計は" + d_sum + " です。");
        }
        if (d_sum > 21) {
            //Bustしたかどうかを判定する
            System.out.println("合計が" + d_sum + "でディーラーはBustしました");
        } else {
            System.out.println("ディーラーのカードの合計" + d_sum + "で確定しました。");
        }
    }
}

