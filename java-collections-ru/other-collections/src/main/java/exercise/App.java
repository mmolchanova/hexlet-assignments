package exercise;

import java.util.*;

// BEGIN
class App {
    public static LinkedHashMap<String, Object> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Set<String> union = new HashSet<>(data1.keySet());
        union.addAll(data2.keySet());

        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>(union.size());

        for (String key: union) {
            result.put(key, "changed");
        }

        Set<String> added = new HashSet<>(data2.keySet());
        added.removeAll(data1.keySet());

        for (String key: added) {
            result.put(key, "added");
        }

        Set<String> deleted = new HashSet<>(data1.keySet());
        deleted.removeAll(data2.keySet());

        for (String key: deleted) {
            result.put(key, "deleted");
        }

        Set<Map.Entry<String, Object>> unchanged = new HashSet<>(data1.entrySet());
        unchanged.retainAll(data2.entrySet());

        for (Map.Entry<String, Object> entry: unchanged) {
            result.put(entry.getKey(), "unchanged");
        }
        System.out.println("result" + result);

        return result;
    }

    public static void main(String[] args) {

    }
}
//END
