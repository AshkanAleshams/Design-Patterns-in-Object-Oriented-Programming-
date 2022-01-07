package visitorExample;

public class TaxVisitor implements Visitor {

	public TaxVisitor() {
		
	}

	@Override
	public double visit(Liquor liquorItem) {
		
		return liquorItem.getPrice() * 0.16 + liquorItem.getPrice();
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		
		return tobaccoItem.getPrice() * 0.20 + tobaccoItem.getPrice();
	}

	@Override
	public double visit(Necessity necessityItem) {
		
		return necessityItem.getPrice() * 0 + necessityItem.getPrice();
	}
}
