package com.busyqa.course.functional_programming.method_reference;

interface Sayable1{  
    void say();  
}  

public class Reference01StaticMethod {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable1 sayable = Reference01StaticMethod::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  