import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class DateOperations {

	OffsetDateTime dateTime;
	
	public DateOperations(OffsetDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public int getYear() {
		return dateTime.getYear();
	}
	
	public int getMonth() {
		return dateTime.getMonthValue();
	}
	
	public int getDay() {
		return dateTime.getDayOfMonth();
	}
	
	public DayOfWeek getDayOfWeek() {
		return dateTime.getDayOfWeek();
	}
	
}
