package com.in28mins.springin5steps;

import com.in28mins.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplicationBasic {
    //what are the beans
    //what are the dependencies of a bean
    //where to search for beans => no need
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationBasic.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{1, 3, 5, 7, 8}, 3);
        System.out.println(result);
    }

}