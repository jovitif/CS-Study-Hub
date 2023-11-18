package TopInterview150.Array_String;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] vetaux = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while (i < m) 
            vetaux[k++] = nums1[i++];
        
        while (j < n) 
            vetaux[k++] = nums2[j++];

        Arrays.sort(vetaux);

        for (int l = 0; l < vetaux.length; l++) 
            System.out.print(vetaux[l] + " ");
    }
	
	public static void main(String []args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int n = 3,m = 3;
		merge(nums1,m,nums2,n);
}
}
