public class EmployeeTester {

	public static void main(String[] args) {
		System.out.print("Employee: ");
		Employee sally = new Employee();
		System.out.print(sally.getHours() + ", ");
		System.out.printf("$%.2f, ", sally.getSalary());
		System.out.print(sally.getVacationDays() + ", ");
		System.out.println(sally.getVacationForm());
		
		System.out.print("Secretary: ");
		Secretary pat = new Secretary();
		System.out.print(pat.getHours() + ", ");
		System.out.printf("$%.2f, ", pat.getSalary());
		System.out.print(pat.getVacationDays() + ", ");
		System.out.println(pat.getVacationForm());
		pat.takeDictation("hello");

        System.out.print("Lawyer: ");
        Lawyer kelly = new Lawyer();
		System.out.print(kelly.getHours() + ", ");
		System.out.printf("$%.2f, ", kelly.getSalary());
		System.out.print(kelly.getVacationDays() + ", ");
		System.out.println(kelly.getVacationForm());
		kelly.sue();

        System.out.print("Marketer: ");
        Marketer john = new Marketer();
		System.out.print(john.getHours() + ", ");
		System.out.printf("$%.2f, ", john.getSalary());
		System.out.print(john.getVacationDays() + ", ");
		System.out.println(john.getVacationForm());

        System.out.print("Legal Secretary: ");
        LegalSecretary bob = new LegalSecretary();
		System.out.print(bob.getHours() + ", ");
		System.out.printf("$%.2f, ", bob.getSalary());
		System.out.print(bob.getVacationDays() + ", ");
		System.out.println(bob.getVacationForm());
		 bob.fileLegalBriefs();
	}

}