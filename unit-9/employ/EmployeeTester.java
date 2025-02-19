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
	}

}