package com.company;

public class Main {

    public static void main(String[] args) {
        //Testing with integers
        Integer[] arr = {1 , 2 , 3 , 4 , 5 , 6 ,7 , 8, 9, 10};

        Search<Integer> search = new BinarySearch<>();
        SearchEngine<Integer> searchEngine = new SearchEngine<>(arr, 11, search);
        searchEngine.showIndex();

        //Testing with characters
        Character[] characters = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h'};
        Search<Character> findIndex = new BinarySearch<>();
        SearchEngine<Character> searchEngine1 = new SearchEngine<>(characters , 'p' , findIndex);
        searchEngine1.showIndex();


    }
}
