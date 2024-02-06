import java.time.OffsetDateTime;

public class Main {
//	Ottieni l'anno
//	Ottieni il mese
//	Ottieni il giorno
//	Ottieni il giorno della settimana
	
	public static void main(String[] args) {
		DateOperations operations = new DateOperations(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
		System.out.println("Year - " + operations.getYear());
		System.out.println("Month - " + operations.getMonth());
		System.out.println("Day - " + operations.getDay());
		System.out.println("Day of week - " + operations.getDayOfWeek());
	}
}
