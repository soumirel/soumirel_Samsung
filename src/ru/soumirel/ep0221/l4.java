package ru.soumirel.ep0221;

/*

static для поля - единое для всего класса
final - неизменяемое извне класса поле
Thread.sleep(100); // пазуа в милисекундах

*/

import java.util.Random;

public class l4 {
    public static void main(String[] args){

        Rectangle r = new Rectangle(2,5);
        showInfo(r);
        formatRectToStick(r, 6);
        showInfo(r);
        Square s= new Square(4);
        showInfo(s);
        s.setSize(16);
        s.setHeight(9);
        showInfo(s);
        Rectangle someRec = s;
        formatRectToStick(someRec, 7);
        showInfo(someRec);
    }

    private static void formatRectToStick(
            Rectangle r,
            int baseSize) {
        r.setWidth(baseSize);
        r.setHeight(baseSize * 2);
    }

    public static void showInfo(Rectangle r) {
        System.out.println(r.getWidth() +
                " x " +
                r.getHeight());
    }

    private static void workWithAllianceHero() {
        Hero hero = new Hero("Рабочий");
        AllianceHero hero2 = new AllianceHero("Крестьянин");
        Hero[] heroes = {hero, hero2};
        for (Hero h: heroes) {
            System.out.println(h.getPhrase());
        }
    }

    private static void workWithStaticPrivateConstrictions() {
//        Hero hero1 = new Hero("Альянс");
//        Hero hero1 = Hero.createAlyansHero("");
//        Hero hero2 = Hero.createOrdaHero("");
//        Hero hero3 = Hero.createNejitHero("");
//        System.out.println(hero1.getPhrase());
//        System.out.println(hero2.getPhrase());
//        System.out.println(hero3.getPhrase());
    }
    private static void workWithStatic() {
        Person[] people = {
                new Person("Bolek"),
                new Person(null),
                new Person("Lelek"),
                new Person(null),
                new Person("Tolek"),
                new Person(null),
                new Person("Maksim"),
                new Person("Maksim"),
                new Person("Maksim"),
        };

        Random random = new Random(300);
        for (Person p : people){
            p.setHeightInMeters(random.nextDouble() * 2.5);
        }

        for (Person p: people) {
            System.out.println(p.getName()
                    + " " + p.getPrettyHeight());
//            System.out.println(p.name());
        }
        System.out.println("=============");
        Person.setHeightPoints(1.3, 1.51);
        for (Person p: people){
         System.out.println(p.getName()
                 + " " + p.getPrettyHeight());
     }
    }
}
