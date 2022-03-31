package com.company.Trial;

import java.util.Stack;

public class Editor2 {

    private String content;
    private StringBuilder builder = new StringBuilder();
    private Stack<String> textProgression = new Stack<>();
    private int contentLength;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setTextProgression(this.content);
    }

    public void undo(){
        if (textProgression.toArray().length > 0)
            textProgression.pop();
    }

    @Override
    public String toString(){
        Object[] text = textProgression.toArray();
        int len = text.length ;

        if (len > 0) {
            for (int i = 0; i < len - 1; i++)
                builder.append(text[i]).append(" ");
            builder.append(text[--len]).append(" ");
        }

        return String.valueOf(builder).trim();
    }

    private void setTextProgression(String content){
        textProgression.push(content);
        contentLength++;
    }

}
