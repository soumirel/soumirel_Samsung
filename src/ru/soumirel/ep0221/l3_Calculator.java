package ru.soumirel.ep0221;

public class l3_Calculator {
    private int current = 0;

    public int sum(int num) {  //sum - метод класса
        current += num;
        return current;
    }
    public int getCurrent(){
        return current;
    }
}
