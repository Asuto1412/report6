package jp.ac.uryukyu.ie.e175758;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class CardTest {
    @Test
    void deal() {
        int p = 1;
        int sum = 22;
        if (p == 1) {
            p = 11;
        }
        sum += p;
        //Aが手札にあり、合計が22を超えている場合、Aの値を1に変更
        if (sum > 21) {
            for (int k = 0; k <= sum; k++) {
                if (p == 11) {
                    p = 1;
                    sum -= 10;
                }
            }
        }
        assertEquals(p,1);
    }

}