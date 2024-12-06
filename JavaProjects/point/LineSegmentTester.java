public class LineSegmentTester {
    
    public static void main(String[] args) {
        Point p1 = new Point(3,10);
        Point p2 = new Point(-4,7);
        Point p3 = new Point(5,-2);
        Point p4 = new Point(20,20);
        LineSegment seg1 = new LineSegment(p1, p2, "M", "K");
        LineSegment seg2 = new LineSegment(p3, p4);
        LineSegment seg3 = new LineSegment(new Point(-7, -8), new Point(2,2), "R", "S");
        System.out.println("Segment 3 is:" + seg3);

Point temp1 = seg3.getPoint1();
Point temp2 = seg3.getPoint2();
System.out.println(temp1);
System.out.println(temp2);
    }
}
