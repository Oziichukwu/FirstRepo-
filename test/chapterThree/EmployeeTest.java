import chapterThree11.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    Employee myEmployee1;
    Employee myEmployee2;

    @BeforeEach
    public void setup(){

         myEmployee1 = new Employee("David", "Asgard",10000.0);

         myEmployee2 = new Employee("george","Franklin",20000.0);
    }

    @Test
    public void firstNameTest(){

    myEmployee1.setFirstName("Funke");

    assertEquals("Funke", myEmployee1.getFirstName());
    }

    @Test

    public void lastNameTest(){

        myEmployee1.setLastName("Tobechukwu");

        assertEquals("Tobechukwu", myEmployee1.getLastName());

    }

    @Test
    public void employee1CanGetMonthlySalary(){

        myEmployee1.setFirstName("Gbenga");

        myEmployee1.setLastName("Olabosede");

        myEmployee1.setMonthlySalary(10000.0);

        assertEquals(10000.0, myEmployee1.getMonthlySalary());
    }

    @Test

    public void employee2CanGetMonthlySalaryTest(){


        myEmployee2.setFirstName("Tega");

        myEmployee2.setLastName("Bosede");

        myEmployee2.setMonthlySalary(20000.0);

        assertEquals(20000.0, myEmployee2.getMonthlySalary());
    }

    @Test

    public void employee1YearlySalaryTest(){

        myEmployee1.setFirstName("Tega");

        myEmployee1.setMonthlySalary(10000.0);

        assertEquals(120000.0, myEmployee1.getYearlySalary());
    }

    @Test

    public void employee2YearlySalaryTest(){

        myEmployee2.setFirstName("Gbenga");

        myEmployee2.setMonthlySalary(20000.0);

        assertEquals(240000.0, myEmployee2.getYearlySalary());
    }

    @Test

    public void employee1GetsATenPercentRaiseTest(){

        myEmployee1.setFirstName("Gbenga");

        myEmployee1.setMonthlySalary(10000.0);

        assertEquals(132000.0, myEmployee1.getyearlySalaryRaise());

    }

    @Test

    public void employee2CanGetATenPercentRaiseTest(){

        myEmployee2.setFirstName("Tega");

        myEmployee2.setMonthlySalary(20000.0);

        assertEquals(264000.0, myEmployee2.getyearlySalaryRaise());
    }
}
