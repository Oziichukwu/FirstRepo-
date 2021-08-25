package chapterThree11;

public class Invoice {


    private String partNumber;

    private String partDescription;

    private int quantity;

    private double price;

    //private double invoiceAmount;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if ( quantity > 0)
        this.quantity = quantity;

        if (price > 0)
        this.price = price;
    }



    public String getPartNumber() {

        return partNumber;
    }

    public void setPartNumber(String partNumber) {

        this.partNumber = partNumber;
    }

    public String getPartDescription() {

        return partDescription;
    }

    public void setPartDescription(String partDescription) {

        this.partDescription = partDescription;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        if ( quantity > 0)
        this.quantity = quantity;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        if ( price > 0)
        this.price = price;
    }

    public double getInvoiceAmount() {

        double invoiceAmount = price * quantity;
            return invoiceAmount;
    }

//    public void setInvoiceAmount(double invoiceAmount) {
//        this.invoiceAmount = invoiceAmount;
//    }


}
