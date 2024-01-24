
public class MyPoint {
    private int x;
    private int y;

    // Default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get x and y in a 2-element int array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // toString method to return a string description of the instance
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Method to calculate distance from this point to another point at the given (x, y) coordinates
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Overloaded distance method to calculate distance from this point to another MyPoint instance
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Another overloaded distance method to calculate distance from this point to the origin (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        // Creating MyPoint instances
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(3, 4);

        // Testing setXY method
        point1.setXY(1, 2);

        // Testing getXY method
        int[] coordinates = point1.getXY();
        System.out.println("Coordinates of point1: (" + coordinates[0] + ", " + coordinates[1] + ")");

        // Testing toString method
        System.out.println("Point1: " + point1);
        System.out.println("Point2: " + point2);

        // Testing distance methods
        System.out.println("Distance from point1 to (0,0): " + point1.distance());
        System.out.println("Distance from point1 to point2: " + point1.distance(point2));
        System.out.println("Distance from point1 to (5,6): " + point1.distance(5, 6));
    }
}