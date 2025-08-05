package Custom_Runtime_Exception;

public class Task {
    public static void main(String[] args) {
        
    	Library account = new Library();

        account.borrowBook("Geronimo Stilton");
        account.borrowBook("Harry Potter");
        account.borrowBook("Diary of Anne Frank");

        // This will throw the custom runtime exception
        try {
            account.borrowBook("APJ Abdul Kalam");
        } 
        
        catch (BookLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.showBorrowedBooks();
    }
}

// Simple custom unchecked exception
class BookLimitExceededException extends RuntimeException {
	
    private static final long serialVersionUID = 1L;

	public BookLimitExceededException(String message) {
        super(message);
    }
}

// Simple library account class with book borrowing limit
class Library {
	
    private int booksBorrowed = 0;
    private static final int MAX_BOOKS = 3;

    public void borrowBook(String bookName) {
        
    	if (booksBorrowed >= MAX_BOOKS) 
            throw new BookLimitExceededException("You can't borrow more than " + MAX_BOOKS + " books.");
        
        booksBorrowed++;
        System.out.println("Borrowed: " + bookName);
    }

    public void showBorrowedBooks() {
        System.out.println("Total books borrowed: " + booksBorrowed);
    }
}
