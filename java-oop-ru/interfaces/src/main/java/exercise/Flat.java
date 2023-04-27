package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return this.area + this.balconyArea;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.floor + " этаже";
    }
}
// END
