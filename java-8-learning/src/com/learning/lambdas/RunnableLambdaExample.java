package com.learning.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 *  STANDARD APPROACH 
		 *  
		 */
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside RUNNABLE STANDARD");
			}
		};
		new Thread(runnable).start();
		
	

	/*
	 * 
	 * LAMBDA APPROACH 
	 *  
	 */
	Runnable runnable2 = () -> {
		System.out.println("Inside RUNNABLE LAMBDA");
	};
	
	new Thread(runnable2).start();
}
}
