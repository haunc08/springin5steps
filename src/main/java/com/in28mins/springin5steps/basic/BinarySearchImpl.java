package com.in28mins.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    //auto wired by type
    //    @Autowired
    //    private SortAlgo sortAlgo;

    //auto wired by name
    //    @Autowired
    //    private SortAlgo quickSortAlgo;

    //auto wired by qualifier
    @Autowired
    @Qualifier("bubble")
    private SortAlgo sortAlgo;

    public int binarySearch(int[] arr, int number) {
        System.out.println(sortAlgo);
        int[] sortedArr = sortAlgo.sort(arr);
        return 3;
    }
}
