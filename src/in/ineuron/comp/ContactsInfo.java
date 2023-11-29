package in.ineuron.comp;
import java.util.Date;
import java.util.Set;



public class ContactsInfo {
	
	private Set<Long> phones;
	private Set<Date> dates;
	
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	
	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactsInfo [phones=" + phones + ", dates=" + dates + "]";
	}
	
}
