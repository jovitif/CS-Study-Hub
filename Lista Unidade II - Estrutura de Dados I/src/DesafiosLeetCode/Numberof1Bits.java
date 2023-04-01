package DesafiosLeetCode;

import java.util.Scanner;

public class Numberof1Bits {
	
	public static int hammingWeight(int n) {
		  int count = 0;
	        for (int i = 0; i < 32; i++) {
	            if ((n & 1) == 1) {
	                count++;
	            }
	            n >>>= 1;
	        }
	        return count;
	 }
	  public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Binario: " + hammingWeight(00000000000000000000000010000000));
	}
}
