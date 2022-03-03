package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DicesInfoTest {

    private Dices dices;
    private DicesInfo dicesInfo;
    @BeforeEach
    @DisplayName("테스트 전 Dices 클래스 인스턴스 생성")
    void testCreateDices() {
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        RandomNumbers randomNumbers = new RandomNumbers(testArray);
        dices = Dices.createDices(randomNumbers);
        dicesInfo = new DicesInfo(dices);
    }

    @Test
    @DisplayName("굴린 주사위 출력 텍스트 확인 테스트")
    void testGetMessage() {
        assertThat(dicesInfo.getMessage())
            .isEqualTo("주사위1 : 1\n주사위2 : 2\n주사위3 : 3\n");
    }
}