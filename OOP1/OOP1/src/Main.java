
import java.util.zip.Inflater;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product();
		product1.setName("Delongi Kahve Makinasi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(4);
		product1.setImageUrl("bilmemne1.jpg");
		
		Product product2= new Product();
		product2.setName("Smeeg Kahve Makinasi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("bilmemne1.jpg");
		
		Product product3= new Product();
		product3.setName("Kitchen Kahve Makinasi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("bilmemne1.jpg");
		
		Product[] products= {product1,product2,product3};
		
		
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		
		
		IndividualCustomer individualCustomer= new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("213");
		individualCustomer.setPhone("48631484");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorpareteCustomer corpareteCustomer=new CorpareteCustomer();
		corpareteCustomer.setId(2);
		corpareteCustomer.setCompanyName("Kodlama.io");
		corpareteCustomer.setPhone("53349737463");
		corpareteCustomer.setTaxtNumber("11111");
		corpareteCustomer.setCustomerNumber("546789");
		
		Customer[] customer = {individualCustomer,corpareteCustomer};
		
		
		//phpahg
		
	
	}
	

}
