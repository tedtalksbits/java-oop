public class Main {

    public static void main(String[] args) {
//	instances of an Employee

        Employee tedane = new Employee(20000.00, "Mechanic", "Esteé Lauder");
        tedane.firstName = "Tedane";
        tedane.lastName = "Blake";
        tedane.raiseSalary(1500.00);
        System.out.println(tedane.salary);


    }
}
