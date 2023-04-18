package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {
        List<String> freeDomainList = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return (int) emailsList.stream()
                .map(email -> email.split("@")[1])
                .filter((domain) -> freeDomainList.contains(domain))
                .count();
    }

    public static void main(String[] args) {
        
    }
}
// END
