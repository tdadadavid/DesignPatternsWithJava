package com.company;

public class LinearSearch<T extends Comparable<T>> implements Search<T>{

    @Override
    public int find(T[] array, T target) {
        int indexOfElement = 0;

        for(int i = 0; i <= array.length - 1; i++){
            if(target == array[i]){
                return i;
            }
        }
        return -1;
    }
}
