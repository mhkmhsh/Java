public class Student {

	private String name;
	private double gpa;
	private int gradeLevel;
	
	public Student(String nm, double g, int grade) {
		name = nm;
		gpa = g;
		gradeLevel = grade;
	}
	public String getName() {
		return name;
	}
	public double getGPA() {
		return gpa;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public void setName(String n) {
		name = n;
	}
	public void setGradeLevel(int grade) {
		gradeLevel = grade;
	}
	public void setGPA(double g) {
		gpa = g;
	}
}