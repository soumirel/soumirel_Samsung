package ru.soumirel.ep0221;

public class Person {

    private static int lastId;

    private static double soShortPeoplePoint = 1.2;
    private static double shortPeoplePoint = 1.5;

    private String name;
    private double heightInMeters;
    private final int id;

    public Person(String name){
        id = lastId++;

        if (name == null || name.length() == 0){
            name = "DEFAULT NAME #" + id;
        }
        this.name = name;
    }

    public void setName(String name){
        if (name == null || name.length() == 0){
            return;
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public static void setHeightPoints(
            double soShortPeoplePoint,
            double shortPeoplePoint
    ) {
        Person.soShortPeoplePoint = soShortPeoplePoint;
        Person.shortPeoplePoint = shortPeoplePoint;
    }


    public String getPrettyHeight() {
        if (this.heightInMeters < Person.soShortPeoplePoint){
            return "Стремянка";
        }
        if (heightInMeters < shortPeoplePoint){
            return "Полторашка";
        }
        return "Вроде норм";
    }


}
