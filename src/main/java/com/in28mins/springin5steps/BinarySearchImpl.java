package com.in28mins.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private final SortAlgo sortAlgo;

    public BinarySearchImpl(SortAlgo sortAlgo) {
        super();
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] arr, int number) {
        System.out.println(sortAlgo);
        int[] sortedArr = sortAlgo.sort(arr);
        return 3;
    }
}
