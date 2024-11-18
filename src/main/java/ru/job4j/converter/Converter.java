package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl;
        rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        return value / 73.5f;
    }

    public static float euroToDollar(float value) {
        float rsl;
        rsl = value * 1.17f;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl;
        rsl = value * 0.85f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles is " + euro + " euro.");
        euro = Converter.dollarToEuro(17);
        System.out.println("17 dollars is " + euro + " euro.");
        float dollars = Converter.rubleToDollar(567);
        System.out.println("567 rubles is " + dollars + " dollars.");
        dollars = Converter.euroToDollar(18);
        System.out.println("18 euro is " + dollars + " dollars.");
    }
}