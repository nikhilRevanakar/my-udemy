package com.learning.strings.QA;

public class AddStrings02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addStrings("11", "123");
	}
	
	// 1
	// 44    11
	// 66	123
	//110   134
	public static String addStrings(String num1, String num2) {
		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();
		int i = num1.length()-1;
		int j = num2.length()-1;
		
		int carry = 0;
		String resp = "";
		while(i>-1 || j>-1) {
			int iVal = -1;
			int jVal = -1;
			
			if(i>=0) {
			iVal = Character.getNumericValue(n1[i]); 
			}
			
			if(j>=0) {
				jVal = Character.getNumericValue(n2[j]); 
			}
			System.out.println("iVal" +iVal);
			System.out.println("jVal" +jVal);
				
			if(iVal>=0 && jVal>=0) {
				int sum = iVal + jVal;
				sum = sum+carry;
				resp = Integer.toString(sum%10) + resp;
				carry = sum/10; 
			}
			
			if(iVal>=0 && jVal<0) {
				int sum = iVal + carry;
				
				resp = Integer.toString(sum%10) + resp;
				carry = sum/10; 
			}
			
			if(iVal<0 && jVal>=0) {
				int sum = jVal + carry;
				
				resp = Integer.toString(sum%10) + resp;
				carry = sum/10; 
			}
			
			
			i--;
			j--;
		}
		
		if(carry>0) {
			resp = carry + resp;
		}
		
		System.out.println(resp);
		return null;    
    }

}
