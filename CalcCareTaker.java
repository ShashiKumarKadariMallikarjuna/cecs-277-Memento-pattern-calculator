package assignment8p3;
/** Caretaker class 
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 3
 * @since Due - 11/28/18
 */
import java.util.ArrayList;
import java.util.List;

public class CalcCareTaker {
	List<MementoCalculator> list=new ArrayList<MementoCalculator>();
	/**adds the MementoCalculator object to the list
	 * @param mc MementoCalculator object
	 */
	public void add(MementoCalculator mc) {
		list.add(mc);
	}
	/**return the last MementoCalculator object
	 * @return MementoCalculator object
	 */
	public MementoCalculator getLast() {
		return list.get(list.size()-1);
	}
}
