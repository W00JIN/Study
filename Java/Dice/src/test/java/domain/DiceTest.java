package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiceTest {

    private Dice dice;

    @BeforeEach
    @DisplayName("테스트 전 Dice 클래스 인스턴스 생성")
    void testCreateDice() {
        dice = new Dice(1);
    }

    @Test
    @DisplayName("Dice 클래스 내 getDiceNumber()메소드 테스트")
    void testGetDiceNumber() {
        assertThat(dice.getDiceNumber())
            .isEqualTo(1);
    }
}