package step2.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoIssuer {
    private static final int LOTTO_PRICE = 1000;
    private static final List<Integer> LOTTO_NUM_STORE = new ArrayList<>();

    static {
        for(int i = 1; i <= 45; i++){
            LOTTO_NUM_STORE.add(i);
        }
    }

    public static List<Lotto> issue(Money money) {
        List<Lotto> LottoList = new ArrayList<>();

        for (int i = 0, j = money.getNumberOfPurchases(LOTTO_PRICE); i < j; i++) {
            LottoList.add(Lotto.create(getRandomLottoNumber()));
        }

        return LottoList;
    }

    public static List<Integer> getRandomLottoNumber() {
        Collections.shuffle(LOTTO_NUM_STORE);
        return LOTTO_NUM_STORE.subList(0, 6);
    }
}