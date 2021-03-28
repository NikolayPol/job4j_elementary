package ru.job4j;

public class Converter {
    public static float rubleToEuro(int value) {
        return value / 70.0f;
    }

    public static float rubleToDollar(int value) {
        return value / 60.0f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}
