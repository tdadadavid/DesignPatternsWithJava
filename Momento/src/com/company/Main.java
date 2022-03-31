package com.company;

import com.company.momento.Editor;
import com.company.momento.History;

public class Main {
    public static void main(String[] args){

        Editor editor = new Editor();
        History history = new History();

        editor.setContents("My name is King ");
        history.push(editor.createState());

        editor.setContents("and I am a backend Developer ");
        history.push(editor.createState());

        editor.setContents("Check me out on linkedIn.");
        history.push(editor.createState());

        editor.setContents("My twitter handle is @DOloruntofunmi ");
        history.push(editor.createState());

        editor.setContents("My LinkedIn handle is David (Oloruntofumi) Dada.");
        history.push(editor.createState());

        editor.undo(history.pop());
        editor.undo(history.pop());

        System.out.println(editor.getContents());
    }
}
