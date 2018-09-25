package OnlineBookStore;

public class Reader {
	
	String readerName;
	String borrowedBook;
	String RequestedBook;

	
	public Reader(String readerName, String borrowedBook, String RequestedBook) {
		// TODO Auto-generated constructor stub
		this.readerName= readerName;
		this.borrowedBook= borrowedBook;
		this.RequestedBook=RequestedBook;
		
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getBorrowedBook() {
		return borrowedBook;
	}

	public void setBorrowedBook(String borrowedBook) {
		this.borrowedBook = borrowedBook;
	}

	public String getRequestedBook() {
		return RequestedBook;
	}

	public void setRequestedBook(String requestedBook) {
		RequestedBook = requestedBook;
	}
}
