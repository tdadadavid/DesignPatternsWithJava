package com.company;

public class BinarySearch<T extends Comparable<T>> implements Search<T>{

    @Override
    public int find(T[] array, T target) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        int indexOfElement;

        while(start <= end){
            mid = (start + end) / 2;

            /*
                the 'compareTo function returns
                    1 if this obj is greater than the other obj
                   -1 if this obj is less than the other obj
                    0 if they're equal
             */


            if(target.compareTo(array[mid]) == 0){
                indexOfElement = mid;
                return indexOfElement;
            }
            else if(target.compareTo(array[mid]) > 0){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}

