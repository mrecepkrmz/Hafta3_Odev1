package youtubeEgitim;

public class Main {

	public static void main(String[] args) {

		/*int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);*/
		
		
		/*int sayilar1[]= {1,2,3};
		int sayilar2 []= {10,20,30};
		sayilar1=sayilar2;
		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);*/
		
		/*CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		/*Customer customer = new Customer();
		
		
		Person person = new Person();
		person.setFirstName("Recep");
		person.setId(11);
		person.setLastName("Kırmıızı");
		person.setNationalIdentity("123456789");
		
		Company company = new Company();
		company.setTaxNumber("485487");
		company.setCompanyName("Beko");
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new Company());
		customerManager.add();
		customerManager.delete();*/
		
		
		
		//Customer customer1 = new Customer();
		//Customer customer2 = new Company();
		//customer1.set
		
		
		
		/*CustomerManager customerManager2 = new CustomerManager();
		customerManager2.add(company);
		customerManager2.delete(company);*/
		
		CustomerManager customerManager = new CustomerManager(new Customer(),new FarmerCreditManager());
		customerManager.giveCredit();
		
		
		
	}

}
