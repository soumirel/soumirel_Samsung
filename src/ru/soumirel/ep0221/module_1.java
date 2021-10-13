package ru.soumirel.ep0221;

import java.util.Scanner;

public class module_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 2;
        while (a < 17) {
            a *= a;
        }
        System.out.println(a);
    }
}
