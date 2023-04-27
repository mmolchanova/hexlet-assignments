package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        return homes.stream()
            .sorted(Comparator.comparing(Home::getArea))
            .map(Object::toString)
            .limit(n)
            .collect(Collectors.toList());
    }
    public static void main(String[] args) {

    }
}
// END
