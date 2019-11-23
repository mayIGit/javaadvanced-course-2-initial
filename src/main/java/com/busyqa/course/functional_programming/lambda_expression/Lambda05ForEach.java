package com.busyqa.course.functional_programming.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda05ForEach{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          /*void	accept(T t) */
        Consumer<String> consumer = n->System.out.println(n);
        
        list.forEach(consumer);  
        /*list.forEach((n)->System.out.println(n)); */ 
;
    }  
} 
