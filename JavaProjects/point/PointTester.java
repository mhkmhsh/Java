public class PointTester {
    public static void main(String[] args) {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("p1 is at " + p1);
        System.out.println("p2 is at " + p2);

        System.out.println("p1: x = " + p1.getX() + " y = " + p1.getY());
        System.out.println("p2: x = " + p2.getX() + " y = " + p2.getY());

        System.out.println("\np1 distance from origin is: " + p1.distanceFromOrigin());
        System.out.println("\np2 distance from origin is: " + p2.distanceFromOrigin());

        p2.translate(3.0, 4.0);
        System.out.println("\nAfter calling translate p2: x = " + p2.getX() + " y = " + p2.getY());

        p1.setLocation(1, 1);
        System.out.println("\nAfter calling setLocation p1: x = " + p1.getX() + " y = " + p1.getY());

    }
}