package ru.soumirel.ep0221;

public class l3_Person {
    private String name;
    private double height;

    public l3_Person(String name){
        if (name == null){
            name = "DEFAULT NAME";
        }
        this.name = name;
    }

    public void setName(String name){
        if (name == null){
            return;
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
