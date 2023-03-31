package DesafiosLeetCode;

public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false;
	        }
	        
	        int[] count = new int[26]; // 26 letras do alfabeto
	        for (int i = 0; i < s.length(); i++) {
	            count[s.charAt(i) - 'a']++;
	            count[t.charAt(i) - 'a']--;
	        }
	        
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] != 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	 
	public static void main(String []args) {
		String palavra01 = "anagrao";
		String palavra02 = "nagaram";
		System.out.print(isAnagram(palavra01,palavra02));
	}
}
