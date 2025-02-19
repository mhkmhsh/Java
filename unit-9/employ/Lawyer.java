public class Lawyer extends Employee{
    public String getVacationForm(){
        return "pink";
    }
    public int getVacationDays(){
        return 15;
    }
    public void sue(){
        System.out.println("I'll See you in court!");
    }
}