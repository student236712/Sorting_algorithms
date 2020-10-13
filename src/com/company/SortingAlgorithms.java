package com.company;

import java.util.ArrayList;

public class SortingAlgorithms {

    public void heapsort(ArrayList<Integer> arrayList) {
        int counter, helpStorage;
        int n = arrayList.size();
        for (counter = n / 2; counter > 0; counter--) {
            returnCorrectHeapOrder(counter, n,arrayList);
        }
        do {
            helpStorage = arrayList.get(0);   //  put root into end
            arrayList.set(0, arrayList.get(n - 1));
            arrayList.set(n - 1, helpStorage); // put maximum element into end of investigated interval
            n--; //decrease size of investigated interval
            returnCorrectHeapOrder(1, n,arrayList); // return correct order in a sub-heap
        } while (n > 1);

    }

    private void returnCorrectHeapOrder(int counter, int n, ArrayList<Integer> arrayList) {
        int i, j;
        i = arrayList.get(counter - 1);
        while (counter <= n / 2) {
            j = 2 * counter;
            if ((j < n) && (arrayList.get(j - 1) < arrayList.get(j)))
                j++;
            if (i >= arrayList.get(j - 1))
                break;
            else {
                arrayList.set(counter - 1, arrayList.get(j - 1));
                counter = j;
            }
        }
        arrayList.set(counter - 1, i);
    }

    public void quickSort(int left, int right, ArrayList<Integer> arrayList) {
        int helpStorage;
        if (left < right) {
            int pivot = left;
            for (int i = left + 1; i <= right; i++)
                if (arrayList.get(i) < arrayList.get(left)) {
                    pivot++;
                    helpStorage = arrayList.get(pivot);
                    arrayList.set(pivot, arrayList.get(i));
                    arrayList.set(i, helpStorage);
                }
            helpStorage = arrayList.get(left);
            arrayList.set(left, arrayList.get(pivot));
            arrayList.set(pivot, helpStorage);
            quickSort(left, pivot - 1, arrayList);
            quickSort(pivot + 1, right, arrayList);
        }
    }
}
