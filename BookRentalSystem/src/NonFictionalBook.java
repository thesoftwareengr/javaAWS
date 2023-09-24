import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NonFictionalBook extends Book {
	final int FINE_PER_DAY = 5;
	final int MAX_FINE_DAYS = 14;

	NonFictionalBook(String title, String author, int yearPublished) {
		super(title, author, yearPublished);
	}

	public int calculateFine() {
		final int FINE_PER_DAY = 5;
		final int MAX_FINE_DAYS = 14;

		if (isRented()) {
			LocalDate dueDate = LocalDate.now().plusDays(MAX_FINE_DAYS);
			LocalDate returnDate = LocalDate.of(2023, 9, 29);

			System.out.println("Due Date: " + dueDate);
			System.out.println("Return Date: " + returnDate);

			if (returnDate.isAfter(dueDate)) {

				long fineDays = ChronoUnit.DAYS.between(dueDate, returnDate);

				return (int) fineDays * FINE_PER_DAY;
			}
		}

		return 0;
	}

	public String borrow() {
		return "You have borrowed " + this.getTitle() + "\n" + "Please return by: "
				+ LocalDate.now().plusDays(MAX_FINE_DAYS) + "\n" + "Otherwise, you will incur a daily fine of PHP"
				+ FINE_PER_DAY;
	}

}
