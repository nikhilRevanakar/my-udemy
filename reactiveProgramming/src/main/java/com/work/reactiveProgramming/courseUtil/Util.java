package com.work.reactiveProgramming.courseUtil;

import java.util.function.Consumer;

public class Util {
	
	public static Consumer<Object> onNext() {
		return o -> System.out.println("Received: "+o);
	}

	public static Consumer<Throwable> onError() {
		return e -> System.out.println("Error: "+e.getMessage());
	}
	
	public static Runnable onComplete() {
		return () -> System.out.println("Completed!!"); 
	}

}
