package view;

import java.util.Scanner;

public class InputView {

    public int input() {
        System.out.print("주사위 수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
