package com.company.Trial;

public class Editor3 {
    private String content;
    int contentLen = 0;
    private StringBuilder builder = new StringBuilder();


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setTextProgression();
    }

    public void setTextProgression(){
        builder.append(content);
        contentLen++;
    }

    public void undo(){
        builder.delete(builder.lastIndexOf(content) , builder.length());
    }

    @Override
    public String toString(){
        return String.valueOf(builder);
    }
}
