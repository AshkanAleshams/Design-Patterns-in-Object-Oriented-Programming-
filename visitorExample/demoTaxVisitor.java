package visitorExample;

public class demoTaxVisitor {

	public static void main(String[] args) {
		
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor holCalc = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity("milk", 1.99);
		Tobacco cigar = new Tobacco("cigar", 5.00);
		Liquor beer = new Liquor("beer", 1.99);
		
		System.out.println("The price of " + milk.getName() + " during holiday is $" + milk.accept(holCalc)
		+ " but normally is " + milk.accept(taxCalc));
		
		System.out.println("The price of " + cigar.getName() + " during holiday is $" + cigar.accept(holCalc)
		+ " but normally is " + cigar.accept(taxCalc));
		
		System.out.println("The price of " + beer.getName() + " during holiday is $" + beer.accept(holCalc)
		+ " but normally is " + beer.accept(taxCalc));
		
		
	}
}
