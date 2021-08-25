import chapterThree11.Invoice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {

    Invoice myInvoice;

    @BeforeEach
    public void setup(){

         myInvoice = new Invoice("david", "dudu",0,0.0);

    }

    @AfterEach
    public void teardown(){

    }
    @Test
    public void quantityCannotTakeNegativeValueTest(){

    myInvoice.setQuantity(-3);

    assertEquals(0, myInvoice.getQuantity());

    }

    @Test
    public void priceCannotTakeNegativeValueTest(){

        myInvoice.setPrice(-7000);

        assertEquals(0.0,myInvoice.getPrice());
    }

    @Test
    public void quantityCanBeIncreasedTest(){

        myInvoice.setQuantity(500);

        myInvoice.setQuantity(1000);

        assertEquals(1000, myInvoice.getQuantity());
    }

    @Test
    public void invoiceAmountCanBeCalculatedTest(){

        myInvoice.setQuantity(500);

        myInvoice.setPrice(7000.0);

        assertEquals(3500000.0, myInvoice.getInvoiceAmount());
    }

    @Test

    public void invoiceAmountCannotBeCalculatedWithNegativeValues(){

        myInvoice.setQuantity(-500);

        myInvoice.setPrice(-7000.0);

        assertEquals(0.0, myInvoice.getInvoiceAmount());

        System.out.printf("The invoice Amount is %f%n",myInvoice.getInvoiceAmount());
    }
}
