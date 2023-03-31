package DesafiosLeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	// Esse codigo funciona perfeitamente, entretanto no leetcode deu problema de limitação !
	public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
        	int temp = nums[i];
        	for(int j = 0; j < nums.length; j++) {
        		if((nums[j] == temp) && (j != i)) {
        			return true;
        		}
        	}
        }
        return false;
    }
	// Código aceito pelo leetcode. Ele é mais simples, porque utiliza do set 
	public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // já existe no set, então é duplicado
            }
        }
        return false; // não há duplicados
    }
	
	public static void main(String []args) {
		int[] nums = {1,2,3,4,5, 10};
		System.out.print(containsDuplicate2(nums));
	}
}
