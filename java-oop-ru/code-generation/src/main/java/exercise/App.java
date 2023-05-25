package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        String json = car.serialize();
        Path fullPath = Paths.get(path.toUri()).toAbsolutePath().normalize();
        try {
            Files.writeString(fullPath, json, StandardOpenOption.WRITE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Car extract(Path path) {
        Path fullPath = Paths.get(path.toUri()).toAbsolutePath().normalize();
        Car car = null;
        String json = "";
        try {
            json = Files.readString(fullPath);
            car = Car.unserialize(json);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return car;
    }
}
// END
