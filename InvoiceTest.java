public class InvoiceTest{

	public static void main(String[] args){
	
	Invoice myInvoice = new Invoice("port", "pertrt",6500,5982);

	System.out.printf(" Quantity is %d%n price is %.2f%n",myInvoice.getQuantity(), myInvoice.getPrice());
	System.out.printf("The InvoiceAmount is %.2f%n", myInvoice.getInvoiceAmount());



//	Invoice myInvoice = new Invoice("port", "pertrt",-6200,-5352);

//	System.out.printf(" Quantity is %d%n price is %.2f%n",myInvoice.getQuantity(), myInvoice.getPrice());
//	System.out.printf("The InvoiceAmount is %.2f%n", myInvoice.getInvoiceAmount());

		}
}