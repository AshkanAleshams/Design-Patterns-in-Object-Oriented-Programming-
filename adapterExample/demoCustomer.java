package adapterExample;

public class demoCustomer {

	public static void main(String[] args) {
		//Our OldCustomer Object
		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setAddress("75,PeePee Ave,Toronto,33223");
		oldCustomer.setName("Chungus");
		oldCustomer.setAge("20");
		
		//we create a NewCustomer object
		Customer customer = new CustomerAdapter(oldCustomer);
		
		//print
		System.out.println(customer.getName());
		System.out.println(customer.getAge());
		System.out.println(customer.getAddress().getHouseNumber());
		System.out.println(customer.getAddress().getStreetName());
		System.out.println(customer.getAddress().getCity());
		System.out.println(customer.getAddress().getPostalCode());
		
	}
}
