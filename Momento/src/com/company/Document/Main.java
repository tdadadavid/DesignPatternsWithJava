package com.company.Document;

public class Main {
    public static void main(String[] args) {

        Document<String, Object> document = new Document<>();
        DocumentHistory<String, Object> history = new DocumentHistory<>();

        document.setPropertyValue("fontName" , "Cascadia Mono");
        history.push(document.createState());

        document.addProperty("fontSize");
        history.push(document.createState());

        document.setPropertyValue("fontSize" ,12);
        document.setPropertyValue("contents" , "first contents");
        history.push(document.createState());

        document.setPropertyValue("contents" , "Second contents");
        history.push(document.createState());

        document.setPropertyValue("Background color", "Blue");
        history.push(document.createState());

        document.setPropertyValue("Watermark" , true);

        document.undo(history.pop());
        document.undo(history.pop());
        document.undo(history.pop());

        System.out.println(document);

    }
}
