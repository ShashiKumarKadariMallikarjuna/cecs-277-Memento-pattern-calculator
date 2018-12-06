package assignment8p3;
/** Memento calculator originator class 
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 3
 * @since Due - 11/28/18
 */
public class MementoCalculator {
	private int num1;
	private int num2;
	/**overloaded constructor
	 * @param num1
	 * @param num2
	 */
	public MementoCalculator(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	/**method that returns the first number
	 * @return num1
	 */
	public int getNum1() {
		return num1;
	}
	/**method that returns the second number
	 * @return num2
	 */
	public int getNum2() {
		return num2;
	}
	/**method that replaced num1 with new value
	 * @param num1
	 */
	public void setNum1(int num1) {
		this.num1=num1;
	}
	/**method that replaced num2 with new value
	 * @param num2
	 */
	public void setNum2(int num2) {
		this.num2=num2;
	}
}
