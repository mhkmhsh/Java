public class LegalSecretary extends Secretary{
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + 5000.0;
    }
}
