package chapterNine.inheritance;

public class PolymorphismExample {
    public static void main(String[] args) {

        CommissionEmployee commissionEmployee = new CommissionEmployee("Johnny","Chukwuma", "333-222-111",5000,.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Chelsea", "Uranus", "222-111-333", 7000,.04,800);

        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with super class reference","to superclass object", commissionEmployee);

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass reference","to subclass object", basePlusCommissionEmployee);

        CommissionEmployee commissionEmployee1 = new BasePlusCommissionEmployee("kim","philip","232-565-123",6700,.02,780);

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with super class reference","to subclass object", commissionEmployee1);

    }
}
