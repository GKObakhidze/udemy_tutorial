package BasicConcepts;

public class Employee {
    int empId;
    String empName;
    double salary;

   public double getsalary() {
       return salary;
   }

    public void setsalary() {
        this.salary = salary;
    }




    int grade;
    String company = "IBM";

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;

    }



}
