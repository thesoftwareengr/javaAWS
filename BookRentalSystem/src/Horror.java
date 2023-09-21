

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Horror extends Book{

	public Horror(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
	}
	
	@Override
	public int calculateFine() {
		final int FINE_PER_DAY = 10;
		final int MAX_FINE_DAYS = 21;
		
		if(isRented()) {
			LocalDate dueDate = LocalDate.now().plusDays(MAX_FINE_DAYS);
			LocalDate returnDate = LocalDate.of(2023, 9, 29);
			
			System.out.println("Due date: " + dueDate);
			System.out.println("Return date: " + returnDate);
			
			if(returnDate.isAfter(dueDate)) {
				long fineDays = ChronoUnit.DAYS.between(dueDate, returnDate);
				return (int) (fineDays * FINE_PER_DAY);
			}
			
		}
		
		return 0;
	}
	
}
