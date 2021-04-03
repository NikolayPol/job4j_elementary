package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int ost = money - price;

        while (ost > 0) {
            for (int i = 0; i < coins.length; i++) {
                int kol = ost / coins[i];
                for (int j = 0; j < kol; j++) {
                    rsl[size + j] = coins[i];
                }
                size += kol;
                ost = (ost % coins[i]);
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
