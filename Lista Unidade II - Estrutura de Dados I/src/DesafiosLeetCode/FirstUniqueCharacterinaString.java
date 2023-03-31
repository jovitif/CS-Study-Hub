package DesafiosLeetCode;


public class FirstUniqueCharacterinaString {
	public static int firstUniqChar(String s) {
        int[] charCounts = new int[26]; // contador de caracteres
        // contagem de cada caractere
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        // encontrar o primeiro caractere com contagem igual a 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; // não existe caractere único
    }

	public static void main(String []args) {
		String palavra = "loveleetcode";
		System.out.print(firstUniqChar(palavra));
	}
}
