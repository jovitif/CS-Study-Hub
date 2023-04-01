package DesafiosLeetCode;

public class RotateArray {
	
	  public static void rotate(int[] nums, int k) {
	        k %= nums.length; // lida com casos em que k é maior do que o comprimento do array
	        
	        // inverte todo o array
	        reverse(nums, 0, nums.length - 1);
	        // inverte os primeiros k elementos
	        reverse(nums, 0, k - 1);
	        // inverte os últimos elementos após o k-ésimo elemento
	        reverse(nums, k, nums.length - 1);
	    }
	    
	    private static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }
	 
	    public static void showArray(int []nums) {
			int i;
			System.out.print("nums = {");
			for(i = 0; i < nums.length -1; i++)
				System.out.print(nums[i] + ",");
			System.out.print(nums[i] + "}");
		}
		
	 
	public static void main(String []args) {
		int []nums = {1,2,3,4,5,6,7};
		int k = 3; 
		rotate(nums,k);
		showArray(nums);
	}
}
