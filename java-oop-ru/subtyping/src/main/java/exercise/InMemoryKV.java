package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    public HashMap map;

    public InMemoryKV(Map<String, String> map) {
        this.map = new HashMap(map);
    }

    public void set(String key, String value) {
        this.map.put(key, value);
    }

    public void unset(String key) {
        this.map.remove(key);
    }

    public String get(String key, String defaultValue) {
        return (String) this.map.getOrDefault(key, defaultValue);
    }

    public HashMap toMap() {
        return new HashMap<>(this.map);
    }
}
// END
