package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] img) {
        return Arrays.stream(img)
                .map(App::increaseRow)
                .flatMap(row -> Stream.of(row, row))
                .toArray(String[][]::new);
    }

    public static String[] increaseRow(String[] row) {
        return Stream.of(row)
                .flatMap(item -> Stream.of(item, item))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {

    }
}
// END
