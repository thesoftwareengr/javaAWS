import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Nihongo extends Book{


	public Nihongo(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
		// TODO Auto-generated constructor stub
	}

	public int calculateFine() {
		final int FINE_PER_DAY = 5;
		final int MAX_FINE_DAYS = 14;
		
		if(isRented()) {
			LocalDate dueDate = LocalDate.now().plusDays(MAX_FINE_DAYS);
			LocalDate returnDate = LocalDate.of(2023,10,24);
			
			System.out.println("Due date: " + dueDate);
			System.out.println("Return date: " + dueDate);
			
			if(returnDate.isAfter(dueDate)) {
				
				long fineDays = ChronoUnit.DAYS.between(dueDate, returnDate);
				
				return (int) (fineDays * FINE_PER_DAY);
			}
		}
		
		return 0;
	}
}
