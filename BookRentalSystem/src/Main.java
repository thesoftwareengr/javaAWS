import java.util.Scanner;

public class Main {
	public static void main (String [] args) throws Exception {
		//		Book [] library = {		
		//				new FictionBook("Fictional Title 1" , "Author 1 ", 2000),
		//				new FictionBook("Fictional Title 2" , "Author 2" , 2001),
		//				new NonFictionalBook("Fictional Title 1" , "Author 3" , 2002),
		//				new NonFictionalBook("Fictional Title 2" , "Author 4" , 2003),
		//				new SciFi("SciFi 1", "Author 5", 2004)
		//		};

		//		library[1].rent();
		//		library[2].rent();
		//		library[4].rent();


		//		for (Book item: library) {
		//			System.out.println(item.toString());
		//			System.out.println(item.isRented());
		//		}

		//		for (Book item: library) {
		//			if (item.isRented()) {
		////				System.out.println(item.calculateFine());
		//				System.out.println(item+"\n");
		//			}
		//		}

		Scanner scanner = new Scanner(System.in);
		int booksBorrowed = 0, borrow, genre;
		String input, selection;
		Library library = new Library();
		boolean flag = false;

		System.out.println("Welcome to our Book Rental System");
		while(true){	
			if(booksBorrowed>0) {
				System.out.println("You currently have " + booksBorrowed + " borrowed books.");
			}
			System.out.println("Would you like to view our available books?\n"
					+ "1 - Fiction                5 - Horror\n"
					+ "2 - Nonfiction             6 - Nihonggo\n"
					+ "3 - Science Fiction        7 - Isekai\n"
					+ "4 - Romance                8 - Guitar Songs\n"
					+ "9 - Fantasy\n"
					+ "EXIT to exit");
			System.out.print("Please input your selection: ");
			input = scanner.nextLine();

			if(input.equalsIgnoreCase("EXIT")) {
				System.out.println("You currently have " + booksBorrowed + " borrowed books.");
				if(booksBorrowed>0) {
					System.out.println();
					library.printBorrowedBooks();
				}
				System.out.println("Exiting... Goodbye");
				break;				
			}else {

				switch(input) {

				//genre variable cannot yet be used here, still need to verify if its an int
				case "1": library.displayList(Integer.parseInt(input)-1, "Fiction");
				break;
				case "2": library.displayList(Integer.parseInt(input)-1, "Nonfiction");
				break;
				case "3": library.displayList(Integer.parseInt(input)-1, "Science Fiction");
				break;
				case "4": library.displayList(Integer.parseInt(input)-1, "Romance");
				break;
				case "5": library.displayList(Integer.parseInt(input)-1, "Horror");
				break;
				case "6": library.displayList(Integer.parseInt(input)-1, "Nihonggo");
				break;
				case "7": library.displayList(Integer.parseInt(input)-1, "Isekai");
				break;
				case "8": library.displayList(Integer.parseInt(input)-1, "Guitar Songs");
				break;		
				case "9": library.displayList(Integer.parseInt(input)-1, "Fantasy");
					break;
				// insert your assigned genre here
				default: System.out.println("Invalid input...");
				flag=true;

				}

				if(flag==false) {
					System.out.println();
					System.out.println("Would you like to borrow a" + (booksBorrowed>0?"nother":"") +" book?");
					System.out.print("Input (Y/N): ");
					selection = scanner.nextLine();

					if(selection.equalsIgnoreCase("Y")) {
						System.out.println("Which book would you like to borrow?");
						System.out.print("Input (book number): ");
						borrow = scanner.nextInt();
						scanner.nextLine();
						genre = Integer.parseInt(input)-1;
						borrow--; //library class adds +1 when displaying

						if(library.checkBookValidity(genre, borrow)) {
							if(!library.isRented(genre, borrow)) {
								//isRented must return false
								library.rent(genre, borrow);
								booksBorrowed++;
								System.out.println("You have successfully borrowed this book.");
							}else {
								System.out.println("Very sorry, this book is currently being rented by someone else");
							}
						}else {
							System.out.println("Book not found...");
						}
					}else if(selection.equalsIgnoreCase("N")) {
						System.out.println("Thank you");
					}else {
						System.out.println("Invalid input...");
					}
					selection=null;
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}