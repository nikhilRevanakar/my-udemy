package com.learning.recursion;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		/*
		 * Convert number from decimal to binary using recursion
		 * 
		 *   Step:
		 *   1) Divide the number by 2
		 *   2) Get the integer quotient for the next iteration
		 *   3) Get the remainder for the binary digit
		 *   4) Repeat the steps until the quotient is equal to 0
		 *
		 * Please refer DecimalToBinary.Drawio image to understand
		 * 
		 * 13 to binary
		 * 
		 * Division by 2  |  Quotient 	| Remiander
		 * 13/2				6				1
		 * 6/2				3				0
		 * 3/2				1				1
		 * 1/2				0				1
		 *
		 * Now take the remainder from bottom to up
		 * So Binary of decimal 13 is 1101
		 *
		 *10 to binary = 1010
		 *
		 *Division by 2  |  Quotient 	| Remiander
		 *10/2				5				0
		 *5/2				2				1
		 *2/2				1				0	
		 *1/2				0				1	
		 *	
		 *f(n) = n mod 2 + 10 * f(n/2)
		 *
		 */
		
		System.out.println(decTobin(13));
		
	}
	
	public static int decTobin(int n) {
		if(n==0) {
			return 0;
		}
		return n%2 + 10 *decTobin(n/2);
	}

}
