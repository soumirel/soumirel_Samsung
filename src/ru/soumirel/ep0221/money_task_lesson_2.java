package ru.soumirel.ep0221;

import java.util.Scanner;

public class money_task_lesson_2 {
    public static void main(String[] args) {

        //vals
        int[] coins = {10, 9, 5, 1};

        Scanner sc = new Scanner(System.in);

        int input_num = sc.nextInt();
        if (input_num % 10 == 0) {
            for (int i = 0; i < input_num / 10; i++) {
                System.out.print("10 ");
            }
            input_num %= 10;
        }
        if (input_num % 9 == 0) {
            for (int i = 0; i < input_num / 9; i++) {
                System.out.print("9 ");
            }
            input_num %= 9;
        }

            for (int coin : coins) {
                if (input_num % coin == 0 & input_num > 0) {
                    do {
                        System.out.print(coin + " ");
                        input_num -= coin;
                    } while (input_num > 0);
                } else if (input_num - coin > 0) {
                    System.out.print(coin + " ");
                    input_num -= coin;
                }


            }
        }
    }

