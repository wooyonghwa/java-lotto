package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step2.Domain.BonusBall;
import step2.Domain.InputNumber;
import step2.Domain.WinningLotto;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BonusBallTest {
    @Test
    @DisplayName("보너스 볼 생성 테스트 - 중복 테스트")
    void bonusBallTest() {
        assertThatThrownBy(() -> {
            InputNumber inputNumber = new InputNumber("1,2,3,4,5,7");
            BonusBall bonusBall = new BonusBall(5);
            WinningLotto winningLotto = new WinningLotto(inputNumber.numbers(), bonusBall);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("보너스 볼 생성 테스트 - 예외 숫자 테스트")
    void bonusBallTest2() {
        assertThatThrownBy(() -> {
            BonusBall bonusBall = new BonusBall(46);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
