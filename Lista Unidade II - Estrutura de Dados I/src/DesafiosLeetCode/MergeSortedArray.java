package DesafiosLeetCode;

public class MergeSortedArray {
	  public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int []result = new int[n+m];
	        int j = 0;
	        for(int i = 0; i < ((n+m)-1); i++){
	            if(i < n){
	            result[i] = nums1[i];
	            }
	            else{
	            result[i] = nums2[j];
	            j++;
	            }
	        }
	        System.out.print("nums = {");
	        int i;
			for(i = 0; i < result.length -1; i++)
				System.out.print(result[i] + ",");
			System.out.print(result[i] + "}");
	    }
	  
	  public static void main(String []args) {
		  int []nums1 = {1,2,3,0,0,0};
		  int m = 3;
		  int []nums2 = {2,5,6};
		  int n = 3;
		  merge(nums1,m,nums2,n);
	  }
}
