
public class main {

	public static void main (String [] args) {

		Book [] library = {		
				new FictionBook("Fictional Title 1" , "Author 1 ", 2000),
				new FictionBook("Fictional Title 2" , "Author 2" , 2001),
				new NonFictionalBook("Fictional Title 1" , "Author 3" , 2002),
				new NonFictionalBook("Fictional Title 2" , "Author 4" , 2003)
		};

		library[1].rent();
		library[2].rent();


		for (Book item: library) {
			System.out.println(item.toString());
			System.out.println(item.isRented());
		}

		for (Book item: library) {
			if (item.isRented()) {
				System.out.println(item.calculateFine());

			}
		}
	}
}