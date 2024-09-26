package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Метод возвращает подстроку максимальной длины в которой не повторяются символы
     * Если найдено несколько подстрок одинаковой длины - вернуть первую.
     *
     * Пример 1 вход= abcddcba, выход = abcd
     * Так как найдены две подстроки с неповторяющимися значениями:
     * 1) abcd
     * 2) dcba
     * Они динаковой длины, по этому возвращаем 1 строку
     *
     * Пример 2 вход= abcddcbaX, выход = dcbaX
     * Так как эта подстрока самая большая
     *
     * @param str входная не пустая строка
     * @return максимальная подстрока из уникальных значений
     * Сигнатуру метода не меняем
     */
    public String findMaxSubstring(String str) {
        String result = "";
        int len = str.length();

        List<String> uniqueSubs = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));

        for (int i = 1; i < len; i++) {
            String letterAtI = str.substring(i, i+1);
            if (stringBuilder.indexOf(letterAtI) != -1) {
                uniqueSubs.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(letterAtI);
            } else stringBuilder.append(letterAtI);
        }

        uniqueSubs.add(stringBuilder.toString());

        for (String subStrings : uniqueSubs) {
            if (subStrings.length() > result.length()) {
                result = subStrings;
            }
        }

        return result;
    }


    /**
     * Задача со зведочкой (опционально)
     * <br/>
     * Можно решать так же для английского алфавита, проверять что присутствуют буквы от A до Z хотя бы по одному разу.
     * <br/>
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     *
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     * @see <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048">https://www.codewars.com/kata/545cedaa9943f7fe7b000048</a>
     */
    public boolean check(String sentence){
        int size = 26;
        int startCharCode = 97;
        int[] alphabet = new int[size];

        if (sentence == null) {
            return false;
        }

        sentence = sentence.replaceAll(" ", "");
        if (sentence.length() < size) {
            return false;
        }

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            int index = (int) sentence.charAt(i) - startCharCode;
            if (index < 0 || index > size) {
                continue;
            }
            alphabet[index] = 1;
        }

        return Arrays.stream(alphabet).sum() == size;
    }

    public boolean checkRussian(String sentence){
        int size = 33;
        int startCharCode = 1072;
        int[] alphabet = new int[size];
        if (sentence == null) {
            return false;
        }

        sentence = sentence.replaceAll(" ", "");
        if (sentence.length() < size) {
            return false;
        }

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            int charAt = sentence.charAt(i);

            if (charAt == 1104) {
                continue;
            }

            if (charAt == 1105) {
                charAt--;
            }

            int index = charAt - startCharCode;
            if (index < 0 || index > size) {
                continue;
            }
            alphabet[index] = 1;
        }

        return Arrays.stream(alphabet).sum() == size;
    }

}
