package ru.soumirel.ep0221;

/*
Info:
SDK на курсах сасунг - 1.8

code:
var str = null   -   Если var не знает какой тип выбрать - ошибка компиляции
println() - переносит строку, аргументы не обязательны - перенесёт строку
print() - не переносит

cmd:
 | - перенаправление потока
 > - запись потока в файл с нуля
 >> - запись потока в файл

Hotkeys:
ctrl + shift + alt + L - форматирование кода по правилам написания
shift + F6 - refactor variable
*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lesson_2 {

    public static void main(String[] args) {

//        System.err.println("ERROR HERE");
//        System.out.println(args.length);

        /* System.in.read(); */
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter nums: ");
//        int number1 = sc.nextInt();

//        int number2 = readNumber();
//        System.out.println("sum is " + (number2 + number1));
        int number1 = 4;
        if (number1 > 5) {
            System.out.println(number1 + " more then 5");
        } else if(number1 < 5) {
            System.out.println(number1 + " less then 5");
        } else {
            System.out.println(number1 + " equals to 5");
        }
        while (number1 < 10) {
            System.out.println("while loop num = " + number1);
            number1 += 1;
        }
        do {
            System.out.println("do while loop " + number1);
            number1 -= 1;
        } while (number1 > 6);

        int N = 4;
        int whileI = 0;
        while (whileI < N){
            System.out.println(whileI);
            whileI += 1;
        }

        for  (int i = 0; i < N; i++){
            System.out.println("for loop " + i);
        }
        // Можно улучшить цикл for - for each
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
        // for each
        for (String arg : args) {
            System.out.println("for each loop " + arg);
        }
        var a = 56;
        var b = "123";
        String str = null;

        int[] array1 = new int[3];
        array1[0] = 65;
        array1[1] = 5;
        array1[2] = 8;

        int[] array2 = {65, 5, 8, -4};

        for (int value : array2){
            System.out.println(value);
        }
        int[][] dem2Arr = new int[2][5];
        dem2Arr[1][2] = 1;
        for(int[] row : dem2Arr){
            for (int value : row){
                System.out.print(value + " ");
            }
            System.out.println();

            //Монеты
            // 1 5 9 10
            int z = 10;
            double x = 10;
            System.out.println(z / 3);
            System.out.println(x / 3);
        }
    }
    static void doSmthg(int[] array){
        array[0] = 6500;
    }
}
