package domain;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DicesTest {

    private ArrayList<Dice> diceList;

    @BeforeEach
    @DisplayName("테스트 전 Dices 클래스 인스턴스 생성")
    void testCreateDices() {
        RandomNumbers randomNumbers = new RandomNumbers(6, 3);
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        randomNumbers.setRandomNumber(testArray);
        diceList = Dices.createDices(randomNumbers).getDices();
    }

    @ParameterizedTest
    @DisplayName("Dices 클래스 내 getDices()메소드 테스트")
    @ValueSource(ints = {0, 1, 2})
    void testGetDices(int number) {
        assertThat(diceList.get(number).getDiceNumber())
            .isEqualTo(number + 1);
    }
}