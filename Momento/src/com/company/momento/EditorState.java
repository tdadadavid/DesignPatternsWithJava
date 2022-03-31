package com.company.momento;

public class EditorState {

    private final String contents;

    public EditorState(String contents){
        this.contents = contents;
    }

    public String getState(){
        return contents;
    }



}
