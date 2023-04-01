package DesafiosLeetCode;

public class MissingNumber {
	
	public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return n * (n + 1) / 2 - sum;
    }
	
	public static void main(String []args) {
		int []nums = {9,6,4,2,3,5,7,0,1};
		/*
		 nums = {9,6,4,2,3,5,7,0,1};
		 tamanho de nums = 9
		 somatorio = 37
		 somatorio de todos os números de 0 até 9 = n * (n+1)/2 = 9 *(9+1)/2 = 90/2 = 45
		 somatorioTotal - somatorio = 45 - 37 = 8
		*/
		System.out.print("Numero perdido: " + missingNumber(nums));
	}
}
