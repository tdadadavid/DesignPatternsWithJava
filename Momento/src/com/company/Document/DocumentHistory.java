package com.company.Document;

import java.util.Stack;

public class DocumentHistory<T,E> {

    private final Stack<Properties<T,E>> documentStates = new Stack<>();

    public void push(Properties<T,E> state){
        documentStates.push(state);
    }

    public Properties<T,E> pop(){
        return documentStates.pop();
    }

}
