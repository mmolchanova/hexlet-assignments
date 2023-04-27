package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return this.floorCount + " этажный коттедж площадью " + this.getArea() + " метров";
    }
}
// END
