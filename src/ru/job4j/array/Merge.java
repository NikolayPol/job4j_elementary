package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int rslLength = left.length + right.length;
        int[] rsl = new int[rslLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[k] = left[i];
                i++;
                k++;
            } else {
                rsl[k] = right[j];
                j++;
                k++;
            }

        }
        while (i < left.length) {
            rsl[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            rsl[k] = right[j];
            j++;
            k++;
        }

        return rsl;
    }
}
