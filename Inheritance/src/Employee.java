import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
//    attributes - non-static: different values for each instance of an Employee
    private String name;
    private int emp_id;
    private String title;
    private double salary;
    private int hireDate;

//    constructor
    public Employee(String name, int emp_id, String title, double salary, int hireDate){
        this.name = name;
        this.salary = salary;
        this.emp_id  = emp_id;
        this.title = title;
        this.hireDate = hireDate;

    }

//    getters
    public double getSalary() {
        return salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getHireDate() {
        return hireDate;
    }
    //    setters

    public void setName(String name) {
        this.name = name;
    }

    public void requestPromotion() {
        LocalDate date = LocalDate.now();
        if (this.hireDate < date.getYear()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("You are eligible for promotion, confirm employee id...");
            int id = scanner.nextInt();

            if (id == this.emp_id){
                System.out.println("Excellent");
                double newSalary = (this.salary * 0.1) + this.salary;
                System.out.println("You have received a 10% increase!" );
                System.out.println("Previous: " + this.salary);
                System.out.println("New:" + newSalary );

                this.salary = newSalary;
            }
            else{
                System.out.println("Incorrect id");
            }
        }
       else{
            System.out.println("You are not eligible for promotion");
        }
    }

}

