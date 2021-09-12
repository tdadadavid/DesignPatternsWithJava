package com.company;

public interface Search<T extends  Comparable<T>> {
    public int find(T[] array , T target);
}
