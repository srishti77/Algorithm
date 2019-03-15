package CCI.google;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
	Iterator iterator = null;
	Integer peekVal;
	boolean peeked;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // Initialise any member here.
	    this.iterator = iterator;
	    peekVal = null;
	    peeked = false;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!peeked) {
        	peekVal = (Integer) iterator.next();
        	peeked= true;
        }
        return peekVal;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!peeked) {
	    	return  (Integer) iterator.next();
	    	
	    }
	    
	    Integer tmp = peekVal;
	    peekVal = null;
	    peeked = false;
	    return tmp;
	}

	@Override
	public boolean hasNext() {
	    return peeked;
	}
	
	public static void main(String s[]) {
		
	}
}