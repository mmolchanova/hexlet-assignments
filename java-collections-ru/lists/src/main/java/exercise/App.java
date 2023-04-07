package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String str, String word) {
        List<String> letters = new ArrayList(Arrays.asList(str.split("")));

        for (String letter : word.toLowerCase().split("")) {
            if (letters.contains(letter)) {
                letters.remove(letter);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {}
}
//END
