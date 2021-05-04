package starbucksNeroDemo;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
			customerManager.save(new Customer(1, "BlaBla", "BlaBla", 1962, "11111111111"));
		
		} catch (Exception e) {
			
			System.out.println("Not a valid person. please check the informations you entered" );
		}
		

	}

}
