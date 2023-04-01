package DesafiosLeetCode;

import java.util.Scanner;

public class RomantoInteger {
	
	 public static int romanToInt(String s) {
	        int result = 0;
	        char[] temp = s.toCharArray();
	        for(int i = 0; i < temp.length; i++){
	             if(temp[i] == 'I' && i < temp.length-1 && (temp[i+1] == 'V' || temp[i+1] == 'X'))
	            {
	                result -= 1;
	            } else if(temp[i] == 'X' && i < temp.length-1 && (temp[i+1] == 'L' || temp[i+1] == 'C'))
	            {
	                result -= 10;
	            } else if(temp[i] == 'C' && i < temp.length-1 && (temp[i+1] == 'D' || temp[i+1] == 'M'))
	            {
	                result -= 100;
	            } else if(temp[i] == 'I')
	            {
	                result += 1;
	            } else if(temp[i] == 'V')
	            {
	                result += 5;
	            } else if(temp[i] == 'X')
	            {
	                result += 10;
	            } else if(temp[i] == 'L')
	            {
	                result += 50;
	            } else if(temp[i] == 'C')
	            {
	                result += 100;
	            } else if(temp[i] == 'D')
	            {
	                result += 500;
	            } else if(temp[i] == 'M')
	            {
	                result += 1000;
	            }
	        
	        }
	        return result;
	    }
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String []args) {
		System.out.print("Digite um ano em algarismo romano: ");
		String num = scanner.nextLine();
		System.out.print("Ano: " + romanToInt(num));
	}
}
