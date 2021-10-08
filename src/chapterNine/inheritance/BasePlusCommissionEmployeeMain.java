package chapterNine.inheritance;

public class BasePlusCommissionEmployeeMain {

    public static void main(String[] args) {

    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("john","okonkwo","333-33-333", 3000,0.04,500);

    System.out.printf("%n%s: %n%n%s%n", "Employee information", basePlusCommissionEmployee);
    }
}
