package com.work.reactiveProgramming.mono;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;

public class Lec01MonoJust {

	public static void main(String[] args) {
		
		Mono<Integer> just = Mono.just(1);
		
		// 1 Print the mono
		just.subscribe(s -> System.out.println(s));
		
		// 2  Subscirbe to mono
		Disposable subscribe = just.subscribe();
		
		// 3. 
	}

}
