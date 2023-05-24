package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    protected String body;
    protected List<Tag> children;

    public PairedTag(String tagName, Map<String, String> attributes, String body, List<Tag> children) {
        super(tagName, attributes);
        this.body = body;
        this.children = children;
    }

    public String childrenToString() {
        if (children.isEmpty()) return "";

        return children.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());
    }

    @Override
    public String toString() {
        return "<" +
                tagName +
                attributesToString() +
                ">" +
                body +
                childrenToString() +
                "</" +
                tagName +
                ">";
    }
}
// END
