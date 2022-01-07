package visitorExample;

public class TaxHolidayVisitor implements Visitor {

	public TaxHolidayVisitor() {
		
	}

	@Override
	public double visit(Liquor liquorItem) {
		
		return liquorItem.getPrice() * 0.20 + liquorItem.getPrice();
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		
		return tobaccoItem.getPrice() * 0 + tobaccoItem.getPrice();
	}

	@Override
	public double visit(Necessity necessityItem) {
		
		return necessityItem.getPrice() * 0 + necessityItem.getPrice();
	}
}
