package DesafiosLeetCode;

public class MoveZeroes {
	
	 public static void moveZeroes(int[] nums) {
	        int index = 0; 
	        // Move todos os números diferentes de zero para o início do array
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[index++] = nums[i];
	            }
	        }
	    
	        // Preencha o restante do array com 0s
	        while (index < nums.length) {
	            nums[index++] = 0;
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
		int []nums = {0,1,0,3,12};
		moveZeroes(nums);
		showArray(nums);
	}
}
