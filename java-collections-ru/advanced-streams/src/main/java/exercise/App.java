package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String configStr) {
        return Stream.of(configStr.split("\n"))
                .filter(str -> str.startsWith("environment"))
                .map(str -> {
                    str = str.replace("environment=", "");
                    str = str.replace("\"", "");
                    return str;
                })
                .flatMap(str -> Arrays.stream(str.split(",")))
                .filter(pair -> pair.startsWith("X_FORWARDED_"))
                .map(pair -> pair.replace("X_FORWARDED_", ""))
                .peek(System.out::println)
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {

    }
}
//END
