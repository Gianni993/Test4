import static org.junit.Assert.*;
import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import org.junit.Test;

public class TestOperations {
	
	DateOperations operations = new DateOperations(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
	
	@Test
	public void testAnno() {
		
		//test on getting the year
		assertEquals(2023, operations.getYear());	
	}

	@Test
	public void testMese() {

		assertEquals(3, operations.getMonth());
	}

	@Test
	public void testGiorno() {

		assertEquals(1, operations.getDay());
	}

	@Test
	public void testDayWeek() {
		
		assertEquals(DayOfWeek.WEDNESDAY, operations.getDayOfWeek());
	}

}
