public class Marketer extends Employee{
   public Marketer(int years){
    super(years);
   }
    public void advertise(){
        System.out.println("Check out our product!");
    }
    public double getSalary(){
        return 50000.0;
    }
}
