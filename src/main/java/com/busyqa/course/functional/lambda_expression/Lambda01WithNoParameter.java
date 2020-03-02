package com.busyqa.course.functional.lambda_expression;

@FunctionalInterface
interface Sayable01 {
	public String say();
}

public class Lambda01WithNoParameter {
		
	public static void main(String[] args) {
		
		Sayable01 s = () -> {
			return "I have nothing to say.";
		};
		
		System.out.println(s.say());			
	}
	
}
