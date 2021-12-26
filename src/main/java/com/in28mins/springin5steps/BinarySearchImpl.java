package com.in28mins.springin5steps;

public class BinarySearchImpl {
    private final SortAlgo sortAlgo;

    public BinarySearchImpl(SortAlgo sortAlgo) {
        super();
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] arr, int number) {
        int[] sortedArr = sortAlgo.sort(arr);
        return 3;
    }
}
