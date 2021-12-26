package com.in28mins.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo {
    public int[] sort(int[] arr) {
        return arr;
    }
}
