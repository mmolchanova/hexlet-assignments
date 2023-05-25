package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            double square = circle.getSquare();
            System.out.println(Math.round(square));
        } catch (NegativeRadiusException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Вычисление окончено");
        }
    }

    public static void main(String[] args) {

    }
}
// END
