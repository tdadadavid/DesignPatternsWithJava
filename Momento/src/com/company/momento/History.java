package com.company.momento;

import java.util.Stack;

public class History {

    private final Stack<EditorState> history = new Stack<>();

    public void push(EditorState state){
        history.push(state);
    }

    public EditorState pop(){
        return  history.pop();
    }
}
