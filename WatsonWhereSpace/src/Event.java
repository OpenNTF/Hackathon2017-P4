import java.util.Date;
import java.util.List;

public class Event {
	private String Event_ID;
	private String Person_ID;
	private String Location_ID;
	List<Date> dates;
	
	
	
	public List<Date> getDates() {
		return dates;
	}
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	public String getEvent_ID() {
		return Event_ID;
	}
	public void setEvent_ID(String event_ID) {
		Event_ID = event_ID;
	}
	public String getPerson_ID() {
		return Person_ID;
	}
	public void setPerson_ID(String person_ID) {
		Person_ID = person_ID;
	}
	public String getLocation_ID() {
		return Location_ID;
	}
	public void setLocation_ID(String location_ID) {
		Location_ID = location_ID;
	}
	
	
	
}
