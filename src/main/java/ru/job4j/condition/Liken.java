package ru.job4j.condition;

import java.util.Optional;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
                System.out.println(result);

        result = first < second;
                System.out.println(result);

        result = first == second;
                System.out.println(result);
    }
}
