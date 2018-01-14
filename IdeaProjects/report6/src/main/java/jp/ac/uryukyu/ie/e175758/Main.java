package jp.ac.uryukyu.ie.e175758;

public class Main {
    public static void main(String[] args) {
        Dealer.F_Deal();

        Player.F_Deal();

        Player.S_Deal();
        Dealer.S_Deal();
        if (Player.sum <= 21 && Dealer.sum <= 21) {
            if(Player.sum > Dealer.sum) {
                System.out.println("プレイヤーの勝利です！！");
            } else if(Player.sum == Dealer.sum) {
                System.out.println("カードの合計値が一緒のため同点です。");
            } else {
                System.out.println("ディーラーの勝利です！！");
            }
        } else if(Player.sum <= 21 && Dealer.sum > 21) {
            System.out.println("プレイヤーの勝ちです。");
        } else {
            System.out.println("ディーラーの勝ちです");
        }
    }

}
