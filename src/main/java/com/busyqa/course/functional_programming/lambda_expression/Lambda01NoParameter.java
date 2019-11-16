package com.busyqa.course.functional_programming.lambda_expression;

@FunctionalInterface
interface Sayable1 {
	public String say();
}

public class Lambda01NoParameter {
	public static void main(String[] args) {
		Sayable1 s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}
}
