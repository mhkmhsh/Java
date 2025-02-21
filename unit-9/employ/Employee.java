public class Employee {
 private int years;
    public Employee(int initialYears){
        years = initialYears;
    }
    public int getHours(){
        return 40;
    }
    public double getSalary(){
        return 40000.0;
    }
    public int getVacationDays(){
        return 10 +2 * years;
    }
    public String getVacationForm(){
        return "yellow";
    }
    
}
