package lab5;

import java.util.Arrays;

public class Lab5 {
    public static String longestWord(String text) {
        String maxLengthWord = null;
        if (text != null && !text.isEmpty()) {
            text = text.replaceAll("[,.?!;:\"']", "");
            text = text.replace("\n", " ");
            String[] separateWordsArray = text.split(" ");
            System.out.println(Arrays.toString(separateWordsArray));
            maxLengthWord = separateWordsArray[0];
            for (String word : separateWordsArray) {
                if (word.length() > maxLengthWord.length())
                    maxLengthWord = word;
            }

        }
        return maxLengthWord;

    }

    public static boolean isPalindrom(String word) {
        char[] charsOfWord = word.toCharArray();
        for (int i = 0; i < word.length() / 2; i++) {
            if (charsOfWord[i] != charsOfWord[word.length() - 1 - i])
                return false;
            else
                continue;
        }
        return true;
    }

    public static String replaceWord(String text) {

        return text.replaceAll("\\bбяка\\b", "[вырезано цензурой]");
    }

    public static int substringToString(String string, String substring) {
        int numberOfSubstrings = 0;
        while (string.contains(substring)) {
            string = string.replaceFirst(substring, "");
            numberOfSubstrings++;
        }
        return numberOfSubstrings;

    }

    public static String reversedWords(String text) {
        String[] textArray = text.split(" ");
        StringBuilder textBuilder = new StringBuilder("");

        for (String word : textArray) {
            StringBuilder wordB = new StringBuilder(word);
            wordB = wordB.reverse();
            textBuilder.append(wordB).append(" ");
        }
        return textBuilder.toString();
    }


}
