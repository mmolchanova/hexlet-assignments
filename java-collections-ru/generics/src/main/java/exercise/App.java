package exercise;

import java.util.*;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book: books) {
            boolean isEqual = true;

            for (String key: where.keySet()) {
                if (!Objects.equals(book.get(key), where.get(key))) {
                    isEqual = false;

                    break;
                }
            }

            if (isEqual) {
                result.add(book);
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
//END
