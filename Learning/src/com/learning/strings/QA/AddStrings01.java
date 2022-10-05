package com.learning.strings.QA;

public class AddStrings01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addStrings("11", "123"));
	}
	
	// 1
	// 44    11
	// 66	123
	//110   134
	public static String addStrings(String num1, String num2) {
		String res = "";
		
		int i = num1.length()-1;
		int j = num2.length()-1;
		int carry = 0;
		
		while(i>=0 || j>=0 || carry !=0) {
			int iVal = i>=0 ? num1.charAt(i) - '0' : 0;
			int jVal = j>=0 ? num2.charAt(j) - '0' : 0;
			
			i--;
			j--;
			
			int sum = iVal + jVal +carry;
			
			res = (sum%10) + res;
			carry = sum/10;
		}
		return res;    
    }

}
