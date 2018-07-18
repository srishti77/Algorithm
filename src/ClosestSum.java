
public class ClosestSum {
	public static void main(String s) {
		
	}
	
	public void merge(int[] array, int l, int m, int r) {
		
		int n1= m+1-l;
		int n2= r-m;
		
		int l1[] = new int[n1];
		int l2[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			l1[i] = array[l+i];
		
		for(int i=0; i<n2; i++)
			l2[i] = array[m+1+i];
		
		int array2[] = new int[n1+n2];
		int i=0, j=0, k=0;
		
		while(i<n1 && j<n2) {
			if(l1[i] <=l2[j])
			{
				array2[k] =l1[i];
				i++;
			}
			else {
				array2[k] =l2[j];
				j++;
			}
			k++;
		}
		
		
			while(i<n1) {
				array2[k] =l1[i];
				i++;
				k++;
			}
			
	
			while(j<n2) {
				array2[k] =l2[j];
				j++;
				k++;
			}
			
		
	}
	
	public void sort(int[] array, int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(array,l,m);
			sort(array,m+1,r);
		}
	}
}
