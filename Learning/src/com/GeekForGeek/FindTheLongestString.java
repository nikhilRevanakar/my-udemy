package com.GeekForGeek;

import java.util.HashSet;
import java.util.Set;

public class FindTheLongestString {

//	https://practice.geeksforgeeks.org/problems/8d157f11af5416087251513cfc38ffc4d23be308/1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"ab", "a", "abc", "abd"};
		String longestString = longestString(arr.length, arr);
		System.out.println(longestString);
	}
	
	public static String longestString(int n, String[] arr) {
        // code here
    
    Set<String> set = new HashSet<>();
    for(String s:arr) {
        set.add(s);
    }
    
    String ans = "";
    
    for(String s:arr){
        if(s.length()<ans.length()) {
            continue;
        } else {
            if(isAllPrefix(s, set)) {
                if(s.length() > ans.length()) {
                    ans = s;
                }
                else {
                    if(s.compareTo(ans)<0) {
                    ans = s;
                }
                }
            }
        }
    }
    
    return ans;
        
   }
    
    public static boolean isAllPrefix(String s, Set<String> set) {
        
        for(int i=1;i<s.length();i++) {
            String sub = s.substring(0,i);
            if(!set.contains(sub)) {
                return false;
            }
        }
        
        return true;
    }

}
