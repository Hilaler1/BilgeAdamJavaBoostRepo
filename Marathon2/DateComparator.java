package Marathon2;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getJobStartDate().compareTo(e2.getJobStartDate());
	}

}
