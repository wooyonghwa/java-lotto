package step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PurchaseTest {

    @Test
    @DisplayName("로또 구매시 Lottos 번호 6개 자동 생성 테스트")
    void 로또번호_6개_자동생성_테스트(){
        PurchaseManager manager = new PurchaseManager(new Money(14000));
        Lottos lottos = Lottos.of(manager);
        assertThat(lottos.getLottos().size()).isEqualTo(manager.getPurchasedLottoNumber().getNumber());
    }

}