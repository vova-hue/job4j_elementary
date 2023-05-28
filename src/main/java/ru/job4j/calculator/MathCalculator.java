package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divisionAndSubtraction(double first, double second) {
        return division(first, second)
                + subtraction(first, second);
    }

    public static double allMathFunction(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + division(first, second)
                + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы двух операций: сумма и умножение равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы двух операций: вычетание и деление равен: " + divisionAndSubtraction(10, 20));
        System.out.println("Результат расчета суммы всех операций равен: " + allMathFunction(10, 20));
    }

}
