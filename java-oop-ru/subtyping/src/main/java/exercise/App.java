package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        System.out.println("storage " + storage);
        Map<String, String> mapCopy = new HashMap<>(storage.toMap());
        System.out.println("mapCopy " + mapCopy);

        for (Map.Entry<String, String> entry: mapCopy.entrySet()) {
            storage.unset(entry.getKey());
            storage.set(entry.getValue(), entry.getKey());
        }
        System.out.println("storage2 " + storage);
    }

    public static void main(String[] args) {

    }
}
// END
