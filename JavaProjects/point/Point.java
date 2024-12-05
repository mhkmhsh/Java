public class Point {

	private double x;
	private double y;
	
	public Point(double x1, double y1) {
		x = x1;
		y = y1;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double distanceFromOrigin(){
		return Math.sqrt((x*x)+(y*y));
	}
	public void translate(double dx, double dy){
		setLocation(x + dx, y + dy);
	}
	public void setLocation(double newX, double newY){
		x = newX;
		y = newY;
	}
	public String ToString(){
		return "("  + x + "," + y +")";
	}

	
}