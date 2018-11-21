package CCI;

public class C10_SortedSearch {
	static int array[] = {1,2,3,4,5,6,7,8,9,10};
	public static void main(String s[]) {
		C10_SortedSearch ob= new C10_SortedSearch();
		Listy array = ob.new Listy();
		System.out.println(searchValue(array, 7));
		
	}
	
	private static int searchValue(Listy array2, int value) {
		// TODO Auto-generated method stub
		int i=1;
		
		while( array2.elementAt(i) != -1 && array2.elementAt(i)< value)
			i=i*2;
		return binarySearch(array2, value, i/2, i);
	}

	private static int binarySearch(Listy array2, int value, int low, int high) {
		// TODO Auto-generated method stub
		if(low <= high) {
			int mid = (low+high)/2;
			
			int middle = array2.elementAt(mid);
			
			if(middle == -1 || middle > value )
				return binarySearch(array2, value, low, mid-1);
			else if( middle < value)
				return binarySearch(array2, value, mid+1, high);
			else
				return mid;
		}
		return -1;
	}

	class Listy{
		
		
		public int elementAt(int index) {
			
			if (index < array.length)
				return array[index];
			else
				return -1;
		}
	}
}
