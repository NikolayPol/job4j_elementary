package ru.job4j.condition;

public class SqArea
{
    public static double square(int p, double k) {
//        L = h * k;
//        h = p/2 - h * k;
        double h = (p / 2) / (1 + k);
        double s = h * k * h;
        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
