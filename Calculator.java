package assignment8p3;
/** Memento class which has the required funtions
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 3
 * @since Due - 11/28/18
 */
public class Calculator {
	private int num1;
	private int num2;
	/**method that adds the two numbers
	 * @return sum
	 */
	public int add() {
		return num1+num2;
	}
	/**method that replaces the two numbers with new values
	 * @param num1
	 * @param num2
	 */
	public void setNumbers(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	/**method that returns the MementoCalculator object with the current two numbers
	 * @return MementoCalculator object of num1 and num2
	 */
	public MementoCalculator backUplastCalc() {
		return new MementoCalculator(num1,num2);
	}
	/**restores the two numbers from the MementoCalculator object
	 * @param mem MementoCalculator object
	 */
	public void restorePreviousCalc(MementoCalculator mem) {
		num1=((MementoCalculator)mem).getNum1();
		num2=((MementoCalculator)mem).getNum2();
	}
}
