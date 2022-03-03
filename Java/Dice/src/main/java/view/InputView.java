package view;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_GUIDE = "주사위 수를 입력하세요 : ";
    private final Scanner scanner = new Scanner(System.in);

    public int input() {
        System.out.print(INPUT_GUIDE);

        return scanner.nextInt();
    }
}
