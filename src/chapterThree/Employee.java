package chapterThree11;

public class Employee {


    private String firstName;

    private String lastName;

    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {

        this.monthlySalary = monthlySalary;

    }



    public double getYearlySalary() {

            double yearlySalary =   monthlySalary * 12;

                           return yearlySalary;
    }

    public double getyearlySalaryRaise(){

        monthlySalary = (10 * monthlySalary) / 100  + monthlySalary;

            double yearlySalaryRaise = monthlySalary * 12;

             return yearlySalaryRaise;

    }
}
