public class Employee extends Person{
//    instance attributes
     double salary;
     String jobTitle;
     String company;

//constructor
    Employee(double salary, String jobTitle, String company){
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.company = company;
    }
//     instance methods
    void raiseSalary(double raise){
        this.salary += raise;
    }


}
