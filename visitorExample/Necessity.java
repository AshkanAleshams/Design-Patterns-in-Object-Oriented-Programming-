package visitorExample;

public class Necessity implements Visitable {

	private String Name;
	private double Price;
	
	public Necessity(String Name, double Amount) {
		this.setPrice(Amount);
		this.setName(Name);
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double amount) {
		Price = amount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
