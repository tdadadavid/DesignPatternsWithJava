package com.company.Document;

public class Document <T, E> {
    
    private final Properties<T, E> properties;

    public Document() {
        this.properties = new Properties<>();
    }

    public Document<T, E> addProperty(String property){
        this.setPropertyValue(property, null);
        return this;
    }

    public Document<T, E> setPropertyValue(String property , E value){
        this.properties.setValue(property , value);
        return this;
    }

    public Properties<T,E> createState(){
        return new Properties<T,E>(properties.getState());
    }


    public void undo(Properties<T, E> properties){
        properties.getState();
    }

    @Override
    public String toString(){

        String newLine = "\n";
        StringBuilder sb = new StringBuilder("{").append(newLine);

        for (String key : properties.getState().keySet())
            sb.append("  " + key).append(" = ").append(properties.getState().get(key)).append(newLine);

        sb.append("}");
        return String.valueOf(sb);
    }





}
