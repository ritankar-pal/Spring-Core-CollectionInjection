package in.ineuron.comp;
import java.util.Date;
import java.util.List;

public class College {
	
	private List<String> studNames;
	private List<Date> dateList;
	
	public void setStudNames(List<String> studNames) {
		this.studNames = studNames;
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "College [name=" + studNames + ", date=" + dateList + "]";
	}
	
}
