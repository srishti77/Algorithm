package OnlineBookStore;

public class Book {
	 
	String bookName;
	String authorName;
	
	int noOfCopies;
	
	Book(String bookName, String authorName, int noOfCopies){
		this.bookName =bookName;
		this.authorName = authorName;
		this.noOfCopies = noOfCopies;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	
}
