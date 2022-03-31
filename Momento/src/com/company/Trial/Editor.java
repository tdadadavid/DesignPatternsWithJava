package com.company.Trial;

import java.util.LinkedList;

public class Editor {

    private String content;
    private final LinkedList<String> textProgression =  new LinkedList<>();
    private final StringBuilder builder = new StringBuilder();


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setTextProgression(this.content);
    }

    private void setTextProgression(String content){
        textProgression.addFirst(content);
    }

    public void undo(){
        if (textProgression.toArray().length > 0)
            textProgression.removeFirst();
    }

    @Override
    public String toString(){

        Object[] textArr = textProgression.toArray();
        int len = textArr.length-1;

        if (len >= 0) {
            for (int i = 0; i < len; i++)
                builder.append(textArr[len--]).append(" ");
            builder.append(textArr[0]).append(" ");
        }

        return String.valueOf(builder).trim();
    }

}
