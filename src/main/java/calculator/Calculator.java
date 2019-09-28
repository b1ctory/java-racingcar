package calculator;

import java.util.Scanner;

public class Calculator {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("num2 : ");
        int num2 = scanner.nextInt();

        System.out.println("operator : ");
        String operation = scanner.next();

        Operator operator = Operator.of(operation);
        System.out.println(Operator.result(num1, num2, operator));
    }
}
