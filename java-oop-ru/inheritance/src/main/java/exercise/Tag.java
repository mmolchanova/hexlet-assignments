package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class Tag {
    protected String tagName;
    protected Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    protected String attributesToString() {
        if (attributes.isEmpty()) return "";

        return attributes.keySet().stream()
                .map(key -> " " + key + "=\"" + attributes.get(key) + "\"")
                .collect(Collectors.joining());
    }
}
// END
