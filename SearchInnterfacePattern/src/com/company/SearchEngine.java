package com.company;

public class SearchEngine<T extends Comparable<T>> {
    Search<T> searchType;
    private T[] array;
    private T target;

    /*
        @param array, target, searchType
        The search implements the Search Interface,
        thereby decoupling the SearchEngine class
        with any specific search type
     */
    public SearchEngine(T[] array , T target , Search<T> type){
        this.array = array;
        this.searchType = type;
        this.target = target;

    }

    public void showIndex(){
        System.out.println("Index => " + searchType.find(array , target));
    }

}
