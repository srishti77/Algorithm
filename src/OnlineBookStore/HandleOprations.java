package OnlineBookStore;

import java.util.ArrayList;

public class HandleOprations {
	
	public static ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void loadBooks() {
		Book book1 = new Book("SE", "Srishti Gaihre", 3);
		bookList.add(book1);
		
		Book book2 = new Book("MSE", "Romain Robbes", 1);
		bookList.add(book2);
		
		Book book3 = new Book("VRS", "Gabriele Minneci", 2);
		bookList.add(book3);
		
		Book book4 = new Book("PLE", "Tanu Shree", 5);
		bookList.add(book4);
		
		Book book5 = new Book("ML", "Nejdi kroi", 3);
		bookList.add(book5);
	}
	
	public void borrowBook(String bookName, Reader reader) {
		boolean borrowFlag= false;
		for(Book b: bookList) {
			
			if(b.getBookName().equals(bookName)) {
				int copies =b.getNoOfCopies();
				borrowFlag=true;
				if(copies > 0) {
					b.setNoOfCopies(copies-1);
					reader.setBorrowedBook(bookName);
					
					System.out.println("You have borrowed "+bookName +" book");
				}
				else {
					System.out.println("This book is not avaible at this moment");
					reader.setRequestedBook(bookName);
				}	
				
			}
		}
		
		if(!borrowFlag) {
			System.out.println("Invalid book Name");
		}
		
	}
	
	public void returnBook(String bookName, Reader reader) {
		
		
			if(reader.getBorrowedBook().equals(bookName)) {
				
				for(Book b : bookList) {
					
					if(b.getBookName().equals(bookName)) {
						int copies =b.getNoOfCopies();
							b.setNoOfCopies(copies+1);
							reader.setBorrowedBook(null);
							
							System.out.println("Thank you for returning the book");
					}
				
				}
		
			}
			
			else {
				System.out.println("Invalid book name");
			}
			
	}
			
}
