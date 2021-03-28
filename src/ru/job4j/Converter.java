package ru.job4j;

public class Converter {
    public static float rubleToEuro(int value) {
        return value / 70.0f;
    }

    public static float rubleToDollar(int value) {
        return value / 60.0f;
    }

    public static void main(String[] args) {
        int in = 140;
        float expectedEuro = 2f;
        float expectedDollar = 140 / 60.0f;

        float euro = Converter.rubleToEuro(in);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + dollar + " dollars.");

        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;

        System.out.println(passedEuro);
        System.out.println(passedDollar);

    }
}
