package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);
    public int input() {
        System.out.print("주사위 수를 입력하세요 : ");

        return scanner.nextInt();
    }
}
