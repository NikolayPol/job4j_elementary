package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        for (int i = 0; i < Math.min(word.length, post.length); i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
            }
        }
        return result;
    }
}