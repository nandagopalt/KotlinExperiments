package MethodReferences;

import java.util.function.BiFunction;

public class AddTwoNumbers {
    public static void main(String args[]) {
        BiFunction<Integer, Integer, Double> biFunctionCalculation = AddTwoNumbers::add;
        System.out.println(biFunctionCalculation.apply(20, 30));
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }
}
