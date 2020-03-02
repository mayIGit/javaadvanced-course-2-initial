package com.busyqa.course.functional.method_reference;

public class Reference01StaticMethod { 
	
    static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    
    public static void main(String[] args) {  
    	
        /* Referring static method */  
        Sayable sayable = Reference01StaticMethod::saySomething;  
        
        /* Calling interface method */
        sayable.say();  
    }  
}  