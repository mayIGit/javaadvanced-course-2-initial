package com.busyqa.course.functional_programming.lambda_expression;


public class Lambda04WithAndWithoutReturn {  
	
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{ a= a+1;
        	                        return (a+b);};  
        System.out.println(ad2.add(100,200));  
    }  
} 