
public class Invoice{

	private String partNumber;

	private String partDescription;

	private int quantity;

	private double price;

	private double invoiceAmount;


		public Invoice ( String partNumber, String partDescription, int quantity, int price){

			this.partNumber = partNumber;

			this.partDescription = partDescription;
				
			if ( quantity > 0)
				
				this.quantity = quantity; 

					if ( price > 0)

						this.price = price; 

			}


		public void setPartnumber(String partNumber){
			
		this.partNumber = partNumber;
			
		}

		public String getPartnumber(){

			return partNumber;
			}

		public void setPartDescription( String partDescription){

			this.partDescription = partDescription;

			}

		public String getPartdescription(){

			return partDescription;

			}

		public void setQuantity( int quantity){
			if ( quantity > 0)
		 this.quantity = quantity;
			
			}

		public int getQuantity(){
		
			return quantity;
		} 

		public void setPrice( double price){
				if ( price > 0)
			this.price = price;
			

		}

		public double getPrice(){

			return price;
		}


			public double getInvoiceAmount(){

				 invoiceAmount = quantity * price;

				return invoiceAmount;
			} 

	}