package calculator;

import calculator.exception.NoMatchOperatorException;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    ADD("+", Operator::add),
    SUBTRACT("-", Operator::sub);

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static int sub(int num1, int num2) {
        return num1 - num2;
    }

    private String operator;
    private BiFunction<Integer, Integer, Integer> result;

    Operator(String operator, BiFunction<Integer, Integer, Integer> result) {
        this.operator = operator;
        this.result = result;
    }

    public static Operator of(String operator) {
        return Arrays.stream(values())
                .filter(index -> index.operator.equals(operator))
                .findFirst()
                .orElseThrow(NoMatchOperatorException::new);
    }

    public static int result(int num1, int num2, Operator operator) {
        return operator.result.apply(num1, num2);
    }
}
