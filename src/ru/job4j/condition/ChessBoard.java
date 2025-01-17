package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if ((0 > x1) || (x1 > 7) || (0 > x2 || x2 > 7) || (0 > y1 || y1 > 7) || (0 > y2 || y2 > 7)) {
            return 0;
        }
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            return Math.abs(x2 - x1);
        } else return 0;
    }
}
