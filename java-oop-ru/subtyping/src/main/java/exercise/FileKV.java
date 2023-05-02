package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    public String path;
    public HashMap<String, String> map;

    public FileKV(String path, Map<String, String> map) {
        this.path = path;
        this.map = new HashMap<>(map);
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

    public HashMap<String, String> toMap() {
        return new HashMap<>(this.map);
    }

    public void save() {
        String json = Utils.serialize(this.map);
        Utils.writeFile(this.path, json);
    }

    public HashMap<String, String> getContent() {
        String json = Utils.readFile(this.path);
        return new HashMap<>(Utils.unserialize(json));
    }
}
// END
