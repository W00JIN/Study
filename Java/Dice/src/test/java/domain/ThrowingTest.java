package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThrowingTest {

    private Dices dices;

    @BeforeEach
    @DisplayName("테스트 전 Dices 클래스 인스턴스 생성")
    void testCreateDices() {
        RandomNumbers randomNumbers = new RandomNumbers(6, 3);
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        randomNumbers.setRandomNumber(testArray);
        dices = new Dices(randomNumbers);
    }

    @Test
    @DisplayName("굴린 주사위 출력 텍스트 확인 테스트")
    void testGetMessage() {
        Throwing throwing = new Throwing(dices);
        assertThat(throwing.getMessage()).isEqualTo("주사위1 : 1\n주사위2 : 2\n주사위3 : 3\n");
    }
}