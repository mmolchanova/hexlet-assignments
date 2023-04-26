package exercise;

// BEGIN
class Segment {
    public Point start;
    public Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getBeginPoint() {
        return start;
    }

    public Point getEndPoint() {
        return end;
    }

    public Point getMidPoint() {
        int x = (this.getEndPoint().getX() + this.getBeginPoint().getX()) / 2;
        int y = (this.getEndPoint().getY() + this.getBeginPoint().getY()) / 2;

        return new Point(x, y);
    }
}
// END
