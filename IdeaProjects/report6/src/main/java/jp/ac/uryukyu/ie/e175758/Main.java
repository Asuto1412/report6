package jp.ac.uryukyu.ie.e175758;

public class Main {
    public static void main(String[] args) {
        Dealer.F_Deal();
        Player.F_Deal();

        Player.S_Deal();
        Dealer.S_Deal();
        System.out.println("プレイヤーの合計は" + Player.p_sum + "ディーラーの合計は" + Dealer.d_sum + "です。");
        //if文を使って勝利判定を行う
        //両者ともBustしてしまった時は一般的なルールに従い、ディーラーの勝ちとする
        if (Player.p_sum <= 21 && Dealer.d_sum <= 21) {
            if (Player.p_sum > Dealer.d_sum) {
                System.out.println("プレイヤーの勝利です！！");
            } else if (Player.p_sum == Dealer.d_sum) {
                System.out.println("カードの合計値が一緒のため同点です。");
            } else {
                System.out.println("ディーラーの勝利です！！");
            }
        } else if (Player.p_sum <= 21 && Dealer.d_sum > 21) {
            System.out.println("プレイヤーの勝ちです。");
        } else {
            System.out.println("ディーラーの勝ちです");
        }
    }
}
