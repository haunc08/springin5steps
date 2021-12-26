package com.in28mins.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {
    public int[] sort(int[] arr) {
        return arr;
    }
}
