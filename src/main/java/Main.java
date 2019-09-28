import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x : ");
        int x = scanner.nextInt();
        System.out.print("op : ");
        String op = scanner.next();
        System.out.print("y : ");
        int y = scanner.nextInt();
        System.out.print("");

        Calculator calculator = new Calculator();

        if(op.equals("+")) {
            calculator.plus();
        }
        else if(op.equals("-")) {
            calculator.minus();
        }
        else if(op.equals("/")) {
            calculator.divide();
        }
        else if(op.equals("*")) {
            calculator.multiple();
        }

    }
}
