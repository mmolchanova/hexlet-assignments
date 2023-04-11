package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] wordsArr = sentence.split(" ");
        Map<String, Integer> words = new HashMap<>();

        for (String word: wordsArr) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }

        return words;
    }

    public static String toString(Map<String, Integer> words) {
        StringBuilder str = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> word: words.entrySet()) {
            str.append("  ");
            str.append(word.getKey());
            str.append(": ");
            str.append(word.getValue());
            str.append("  \n");
        }

        str.append("}");

        return str.toString();
    }

    public static void main(String[] args) {

    }
}
//END
