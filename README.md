# This is a Book Rental System. 

- Main.java      ->  This is where methods of the different subclasses were called, contains switch() case that checks what book genre the user will going to borrow.
- Library.java   ->  contains ArrayList collection and adds new elements. Contains displayList() method that displays the available books for every genre. Also checks the validity through the - -checkBookValidity() and                    checks if the book is currently rented, also prints the borrowed books through printBorrowedBooks().
- Book.java      -> Parent class and a blueprint for subclasses. Contains getter(), setter() and a Book constructor. 
               
##### The following are the subclasses for Book.java. The following classes extends the Book class. Each of the subclasses contains calculateFine() method that calculates fine per day for borrowing the corresponding books that exceed their actual return date.

- Fantasy.java           -> Hurly Cabalan
- guitarSongs.java       -> Al Pj Baroro
- Horror.java            -> Rusty Abrantes
- Isekai.java            -> Joerge Lou
- Nihongo.java           -> Matthew del Castro
- Romance.java           -> Rica Noreen Esterado
- SciFi.java             -> Clyde Pilapil
- FictionBook.java       
- NonFictionalBook.java   

