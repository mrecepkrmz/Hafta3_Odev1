package youtubeEgitim;

public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer= customer;
		_creditManager = creditManager;

		

	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println(" Kredi verildi... ");
	}
	
	public void add(){
		System.out.println(" ID numaralı müşteri sisteme eklendi... ");
		
	}
	
	public void delete(){
		System.out.println(" ID numaralı müşteri sistemden silindi... ");
		
	}
}
