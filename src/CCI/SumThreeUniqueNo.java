package CCI;
import java.util.ArrayList;
import java.util.List;

public class SumThreeUniqueNo {

	public static void main(String a[]) {
		
		int arr[] = {82597,-9243,62390,83030,-97960,-26521,-61011,83390,-38677,12333,75987,46091,83794,19355,-71037,-6242,-28801,324};
		
		System.out.println("Given Array");
		print(arr);
		SumThreeUniqueNo s = new SumThreeUniqueNo();
		
		s.sort(arr, 0, arr.length-1);
		
		print(arr);
		List<List<Integer>> stringList = new ArrayList<List<Integer>>();
		
		for(int i =0;i<arr.length-2;i++) {
			int j = i+1;
			int k=arr.length-1;
			
			while(k >=j) {
				
				if(arr[i]+arr[j]+arr[k]==0 && i!=j && j!=k && k!=i) {
					List<Integer> arryList = new ArrayList<Integer>();
					arryList.add(arr[i]);
					arryList.add(arr[j]);
					arryList.add(arr[k]);
					if(!stringList.contains(arryList))
					stringList.add(arryList);
					k--;
				}
				else {
					if(arr[i] + arr[j] + arr[k] > 0)
					 k--;
					else
						j++;
				}
			}
		}
			
			for(int u=0;u< stringList.size(); u++) {
				System.out.println(stringList.get(u));
			}
			
		
	}

	 static void print(int arr[]) {
		System.out.println("Sorted");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	 
	 void merge(int arr[], int l, int m, int r) {
			int n1= m-l+1;
			int n2= r-m;
			
			int L[] = new int[n1];
			int R[] = new int[n2];
			
			for(int i=0; i< n1; ++i)
				L[i] = arr[l+i];
			for(int j=0; j< n2; ++j)
				R[j] = arr[m+1+j];
			
			int i=0, j=0;
			int k=l;
			while(i< n1 && j< n2) {
				
				if(L[i] <=R[j]) {
					arr[k] = L[i];
					i++;
					
				}
				
				
				else {
					arr[k] = R[j];
					j++;
					
				}
				k++;
				
			}
			
			//adding remaining
			
			while(i<n1) {
				arr[k] = L[i];
				k++;
				i++;
			}
			
			while(j<n2) {
				arr[k] = R[j];
				k++;
				j++;
			}
			
		}
	
	 void sort(int arr[], int l, int r) {
		
		if(l<r) {		
			int m = (l+r)/2;
			
			
			
			sort(arr, l, m);
			
			sort(arr,m+1, r);
			
		
			merge(arr, l, m, r);
		}
	}

	
	
}
