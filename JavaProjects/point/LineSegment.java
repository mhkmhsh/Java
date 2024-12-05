
public class LineSegment {

    private String labelPoint1, labelPoint2;
    private Point p1;
    private Point p2;

public LineSegment ( Point p1, Point p2, String sp1, String sp2){
    this.p1 =p1;
    this.p2=p2;
    labelPoint1 = sp1;
    labelPoint2 = sp2
}
public LineSegment ( Point pt1, Point pt2){
    this(pt1, pt2,"A", "B")
}
public double LengthOfSegment(){
    Double diffX = p1.getX() - p2.getX();
    Double diffY = p1.getY() - p2.getY();
    return Math.sqrt( diffX * diffX + diffY * diffY);

}
public String toString(){
    return labelPoint1 + " " + p1 + " " + labelPoint2+ " " + p2;
}
}
