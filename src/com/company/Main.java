package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Create an initial array list with given integers
        ArrayList<Integer> givenArrayList = new ArrayList<>(List.of(2, 1232, 21, 53, 65, 1, 4, 32, 11, 17, 8, 5, 2, 10, 8));

        //Create copies of initial array list
        ArrayList<Integer> arrayListForHeapSort = new ArrayList<>(List.copyOf(givenArrayList));
        ArrayList<Integer> arrayListForQuickSort = new ArrayList<>(List.copyOf(givenArrayList));
        ArrayList<Integer> arrayListForCollectionsSort = new ArrayList<>(List.copyOf(givenArrayList));
        ArrayList<Integer> arrayListForLambdaSorting = new ArrayList<>(List.copyOf(givenArrayList));

        //Create object of my own class sorting algorithms methods
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        //Sort copies
        sortingAlgorithms.heapsort(arrayListForHeapSort);
        sortingAlgorithms.quickSort(0, arrayListForQuickSort.size()-1, arrayListForQuickSort);
        Collections.sort(arrayListForCollectionsSort);
        arrayListForLambdaSorting.sort(Integer::compareTo);

        //Present results
        System.out.println(givenArrayList.toString() + "\t--> before sorting");
        System.out.println(arrayListForHeapSort.toString() + "\t--> after heap sorting");
        System.out.println(arrayListForQuickSort+"\t--> after quick sort");
        System.out.println(arrayListForCollectionsSort + "\t--> after use the collections class sorting");
        System.out.println(arrayListForLambdaSorting + "\t--> after lambda sorting");

    }
}
