//Rica Noreen Esterado
package bookRentalSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Romance extends Book{
	public Romance(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
		
	}
	public boolean isAfter;
	String date2 = "2023, 9, 14";
	String date1 = "2023, 8, 10";
	//super(getTitle(), author, yearPublished);
	
	public int calculateFine() {
		
		final int maximumFine = 50;
		final int maxFineDays = 15;
		if (isRented()) {
			LocalDate dueDate = LocalDate.now().plusDays(maximumFine);
			LocalDate returnDate = LocalDate.of(2023, 9, 14);
			
			System.out.println("Due date: " + dueDate);
			System.out.println("Return date: " + returnDate);
			
			if (returnDate.isAfter(dueDate)) {
				
				long fineDays = ChronoUnit.DAYS.between(dueDate, returnDate);
								
			}
			
		}
		return 0;
	}

}