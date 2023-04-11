package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.length() == 0) return new HashMap<>();

        String[] wordsArr = sentence.split(" ");
        Map<String, Integer> words = new HashMap<>();

        for (String word: wordsArr) {
            Integer count = 1;

            if (words.containsKey(word)) {
                count = words.get(word) + 1;
            }

            words.put(word, count);
        }

        return words;
    }

    public static String toString(Map<String, Integer> words) {
        if (words.isEmpty()) {
            return "{}";
        }

        StringBuilder str = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> word: words.entrySet()) {
            str.append("  ");
            str.append(word.getKey());
            str.append(": ");
            str.append(word.getValue());
            str.append("\n");
        }

        str.append("}");

        return str.toString();
    }

    public static void main(String[] args) {

    }
}
//END
