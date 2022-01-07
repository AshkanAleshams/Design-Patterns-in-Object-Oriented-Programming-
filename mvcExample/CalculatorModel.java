package mvcExample;

public class CalculatorModel {

	private int result;
	
	
	public void addTwo(int num1, int num2) {
		result = num1 + num2;
	}
	
	
	public int getResult() {
		return result;
	}
}
