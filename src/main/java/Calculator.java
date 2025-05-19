
public class Calculator {
	
	CalculatorService service=new CalculatorService();
	
	public int perform(int i,int j) {
		return service.add(i, j);
	}
//calculator
}
