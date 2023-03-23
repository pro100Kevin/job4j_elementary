package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y;
        y = x * x + 1;
        return y;
    }

    public static void func2() {

    }

    public static void main(String[] args) {
        MathFunc.func1(3);
        MathFunc.func2();
        MathFunc.func1(100);
        int result3 = MathFunc.func1(100);
        System.out.println(result3);
    }
}