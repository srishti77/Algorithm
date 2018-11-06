package OnlineBookStore;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBSMain {
	
	public static void main(String S[]) {
		
		
		String readerName;
		String bookName;
		HandleOprations handle= new HandleOprations();
		ReadersDB readerDB= new ReadersDB();
		handle.loadBooks();
		Scanner scan= new Scanner(System.in);	
		
		String operation;
		while(true) {
			System.out.println("Welcome to online store");
			System.out.println("Enter you name");
			readerName = scan.nextLine();
			Reader reader = readerDB.checkIfReaderRegistered(readerName);
			if(reader== null) {
				reader= new Reader(readerName,"", "");
				readerDB.addReader(reader);
			}
			while(true) {
			System.out.println("Please enter the book name");
			bookName = scan.nextLine();
			
			System.out.println("Do you want to borrow a book or return a book(B/R)");
			operation= scan.nextLine();
			
			
			
			if(operation.equals("B")) {
				handle.borrowBook(bookName, reader);
			}
			else if(operation.equals("R")) {
				handle.returnBook(bookName, reader);
				readerDB.offerRequestedBook(bookName);
			}
			else {
				System.out.println("Invalid command , please select either B or R");
			}
			
			System.out.println("Do you want to continue to borrow or return another book(Y/N)");
			String input= scan.nextLine();
			
			if(input.equals("N"))
				break;
			}
		
			System.out.println("You have succesfully logged out. Select option to login as another user(Y/N)");
			String inp= scan.nextLine();
			
			if(inp.equals("Y"))
				continue;
			else
				break;
		}
		
		System.out.println("Thank you for using the online book store");
		
	}
}
