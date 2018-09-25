package OnlineBookStore;

import java.util.ArrayList;

public class ReadersDB {
	ArrayList<Reader> readerList= new ArrayList<Reader>();
	
	public void addReader(Reader reader) {
		readerList.add(reader);
	}
	
	public void offerRequestedBook(String bookName) {
		for(Reader reader: readerList) {
			if(reader.getRequestedBook().equals(bookName)) {
				System.out.println("Dear "+ reader.getReaderName() +" you can take the book "+ bookName +" if you want");
				break;
			}
		}
	}
	
	public Reader checkIfReaderRegistered(String readerName) {
		boolean alreadyReader=false;
		for(Reader reader: readerList) {
			if(reader.getReaderName().equals(readerName)) {
				System.out.println("Thank you for revisit our store");
				alreadyReader=true;
				return reader;
			}
		}
		return null;
		
	}
}
