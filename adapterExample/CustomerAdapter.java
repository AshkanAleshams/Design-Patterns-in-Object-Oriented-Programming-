package adapterExample;

public class CustomerAdapter extends NewCustomer implements Customer {
	private OldCustomer oldCustomer;
	
	
	public CustomerAdapter(OldCustomer oldCust) {
		
		this.oldCustomer = oldCust;
		this.adaptData();
	}
	
	private void adaptData() {
		//dont need to adapt name
		this.setName(oldCustomer.getName());
		//change age type of oldcustomer from string to int
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
		
		
		//Need to create an Address object since oldCustomer has string
		Address address = new Address();
		String[] oldAddress = oldCustomer.getAddress().split(",");
		
		address.setHouseNumber(Integer.valueOf(oldAddress[0]));
		address.setStreetName(oldAddress[1]);
		address.setCity(oldAddress[2]);
		address.setPostalCode(Integer.valueOf(oldAddress[3]));
		
		//now that the Address object is created
		this.setAddress(address);
	}
}
