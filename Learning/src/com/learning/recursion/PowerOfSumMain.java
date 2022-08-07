package com.learning.recursion;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	// URL:  https://www.hackerrank.com/challenges/the-power-sum/problem?isFullScreen=true
    /*
     * Complete the 'powerSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER X
     *  2. INTEGER N
     */
	public static int countNumber = 0;

    public static int powerSum(int X, int N) {
    // Write your code here
        return countSumPower(X,N,1,0,0);
    }

    public static int countSumPower(int num, int power, int curr, int carry, int count){
        System.out.println("Entered %d".formatted(countNumber));
        countNumber++;
    	int sum = carry + (int) Math.pow(curr,power);
        if (sum == num)
            return 1;
        else if (sum > num)
            return 0;
        
        count += countSumPower(num, power, curr+1, sum, 0); // choose curr
        count += countSumPower(num, power, curr+1, carry, 0); // dont choose curr
        
        return count;
    }
}

public class PowerOfSumMain {
	public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.powerSum(20,2));
    }
}
