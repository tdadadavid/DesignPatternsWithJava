package com.company.momento;

public class Editor {

    private String contents;

    public EditorState createState(){
       return new EditorState(contents);
    }

    public void undo(EditorState state){
        contents =  state.getState();
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }
}

