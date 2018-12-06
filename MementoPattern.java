package assignment8p3;
/**MementoPattern main method
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 3
 * @since Due - 11/28/18
 */
public class MementoPattern {
	/**main method
	 * @param args
	 */
	public static void main(String[]args) {
		int num1=10;
		int num2=20;
		Calculator calc=new Calculator();
		calc.setNumbers(num1, num2);
		int sum=calc.add();
		CalcCareTaker history=new CalcCareTaker();
		history.add(calc.backUplastCalc());
		System.out.println("The sum of "+num1+" + "+num2+" = "+sum);
		num1=20;
		num2=30;
		calc.setNumbers(num1, num2);
		sum=calc.add();
		System.out.println("The sum of "+num1+" + "+num2+" = "+sum);
		calc.restorePreviousCalc(history.getLast());
		MementoCalculator c=calc.backUplastCalc();
		System.out.println("The last calculation was: "+c.getNum1()+" + "+c.getNum2()+" = "+calc.add());
	}
}
