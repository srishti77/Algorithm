package CCI;

public class WaterContainer {
	
	public static void main(String s[]) {
		// TODO Auto-generated method stub
		int num[] = {2,3,4,5,18,17,6};
		System.out.println(maxArea(num));
	}
	  public static int maxArea(int[] height) {
	        if(height.length ==0 || height.length== 1)
	            return height.length;
	        else{
	            int left =0;
	            int maxArea =0;
	            int right = height.length-1;
	            
	            while(left< right && left >=0 && right < height.length){
	                
	                int min = 0;
	                int len = right-left;
	                if(height[left] < height[right]){
	                    min = height[left];
	                    left++;
	                }
	                else{
	                    min = height[right];
	                    right--;
	                }
	                int area = len * min;
	                System.out.println(area);
	                if(maxArea < area)
	                    maxArea = area;                
	            }            
	            return maxArea;
	        }
	            
	    }
}
