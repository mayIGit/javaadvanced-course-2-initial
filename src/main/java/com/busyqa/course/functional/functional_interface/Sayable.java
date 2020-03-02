package com.busyqa.course.functional.functional_interface;

@FunctionalInterface
interface ISayable{  
    void say(String msg);  
} 

public class Sayable implements ISayable{  
	
	@Override
    public void say(String msg){  
        System.out.println(msg);  
    }  
    
    public static void main(String[] args) {  
        Sayable s = new Sayable();  
        s.say("Hello there");  
    } 
} 
