import java.util.ArrayList;

public class Library {
	ArrayList<ArrayList<Book>> library = new ArrayList<ArrayList<Book>>(9);
	
	public Library() {		
		for (int i = 0; i < 9; i++) {
			ArrayList<Book> genre = new ArrayList<Book>();
			library.add(genre);
		}
		
		library.get(0).add(new FictionBook("Fictional Title 1" , "Author 1", 2000));
		library.get(0).add(new FictionBook("Fictional Title 2" , "Author 2" , 2001));
		library.get(1).add(new NonFictionalBook("Nonfictional Title 1" , "Author 3" , 2002));
		library.get(1).add(new NonFictionalBook("Nonfictional Title 2" , "Author 4" , 2003));
		
		library.get(2).add(new SciFi("SciFi 1", "Author 5", 2004));
		library.get(2).add(new SciFi("SciFi 2", "Author 5", 2005));
		library.get(2).add(new SciFi("SciFi 3", "Author 6", 2005));
		library.get(2).add(new SciFi("SciFi 4", "Author 7", 2006));
		
		library.get(3).add(new SciFi("Romance 1", "Author 8", 2010));
		library.get(3).add(new SciFi("Romance 2", "Author 9", 2011));
		library.get(3).add(new SciFi("Romance 3", "Author 10", 2012));
		library.get(3).add(new SciFi("Romance 4", "Author 11", 2013));
		
		library.get(4).add(new SciFi("Horror 1", "Author 12", 2015));
		library.get(4).add(new SciFi("Horror 2", "Author 13", 2011));
		library.get(4).add(new SciFi("Horror 3", "Author 14", 2015));
		library.get(4).add(new SciFi("Horror 4", "Author 15", 2019));	
		
		library.get(5).add(new SciFi("Nihongo N1", "Author 16", 2020));
		library.get(5).add(new SciFi("Nihongo N2", "Author 16", 2021));
		library.get(5).add(new SciFi("Nihongo N3", "Author 16", 2022));
		library.get(5).add(new SciFi("Nihongo N4", "Author 16", 2023));	
		
		library.get(6).add(new SciFi("Isekai 1 ", "Author 1", 2023));
		library.get(6).add(new SciFi("Isekai 2", "Author 2", 2020));
		library.get(6).add(new SciFi("Isekai 3", "Author 3", 2019));
		library.get(6).add(new SciFi("Isekai 4", "Author 4", 2016));

		library.get(7).add(new guitarSongs("Love Songs", " Jireh Lim", 2007));
		library.get(7).add(new guitarSongs("Rock", " Bamboo", 2008));
		library.get(7).add(new guitarSongs("Maoy", "Moira dela Torree", 2010));
		
		library.get(8).add(new Fantasy("The Lord of The Rings", " JRR Tolkien", 1954));
		library.get(8).add(new Fantasy("The Name of the Wind", " Patrick Rothfuss", 2007));
		library.get(8).add(new Fantasy("The Lies of Locke Lamora", " Scott Lynch", 2006));
		//add books of your assigned genre here
	}
	
	public void displayList(int index, String genre) {
		System.out.println("\nHere are our available books for the genre: "+genre);
		ArrayList<Book> list = library.get(index);
		for (Book item: list) {
			System.out.println(list.indexOf(item)+1+": "+item);
		}
		
	}

	public boolean checkBookValidity(int index, int bookNumber) {
		return library.get(index).size()>bookNumber;
	}
	
	public boolean isRented(int index, int bookNumber) {
		return library.get(index).get(bookNumber).isRented();	
	}
	
	public void rent(int index, int bookNumber) {
		library.get(index).get(bookNumber).rent();
	}

	public void printBorrowedBooks() {
		for(ArrayList<Book> list: library) {
			for(Book item: list) {
				if(item.isRented()) {
					System.out.println(item.borrow());
					System.out.println();
				}
			}
		}
	}
}
