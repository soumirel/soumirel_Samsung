package ru.soumirel.ep0221;

/*

"переменная" созданная в классе - поле.

объект = экземпляр класса.

в джаве нет функций, есть метод класса,
функция внтури класса - метод .

privat - создание "локального" поля в классе,
им нельзя манипулировать извне.

this - ссылка на самого себя

 */

public class l3 {
    public static void main(String[] args){

        l3_Person person = new l3_Person("Lolek");
        System.out.println(person.getName());
        System.out.println(person.getName().length());
        person.setName("FirstPerson");
        System.out.println(person.getName());
        System.out.println(person.getName().length());
    }

    public static void workWithClass(String[] args) {
        l3_Calculator calc = new l3_Calculator();
        System.out.println(calc.sum(5));
        System.out.println(calc.sum(5));
        System.out.println(calc.getCurrent());
        System.out.println(new l3_Calculator().getCurrent());
    }
}
