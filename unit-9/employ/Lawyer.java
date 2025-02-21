public class Lawyer extends Employee{
    public Lawyer(){
        super(years);
    }
    public String getVacationForm(){
        return "pink";
    }
    public int getVacationDays(){
        return super.getVacationDays() + 5;
    }
    public void sue(){
        System.out.println("I'll See you in court!");
    }
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
}