package com.busyqa.course.functional_programming.lambda_expression;

import java.util.function.UnaryOperator;

public class Lambda09Recursivity {

    public static UnaryOperator<Integer> fib(Integer acc, Integer incr) {
        return x -> {
            return (x > 0) ? fib(acc + incr, acc).apply(--x) : acc;
        };
    }
    
	public static void main(String[] args) {
		
		System.out.println(fib(1, 0).apply(5));
	}

}
