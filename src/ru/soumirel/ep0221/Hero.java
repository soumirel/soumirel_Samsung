package ru.soumirel.ep0221;

public class Hero {

    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getPhrase(){
        return "Неловкое молчание";
    }

    public String getName() {
        return name;
    }

//    public static Hero createAlyansHero(String name) {
//        return new Hero("Альянс", name);
//    }
//
//    public static Hero createOrdaHero(String name) {
//        return new Hero("Орда", name);
//    }
//
//    public static Hero createNejitHero(String name) {
//        return new Hero("Нежить", name);
//    }



//    public String getPhrase(){
//        switch (type) {
//            case "Альянс": return "За Альянс!";
//            case "Орда": return "Опять работа?";
//            case "Нежить": return "Смерть за Нерзула!";
//            case "Нежить2": return "Смерть за Нерзула!";
//            default: return "*Неловкое молчание*" ;
//        }
//    }
}
