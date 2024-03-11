package lesson3;

import java.util.Scanner;

public class lesson3_1_2_MiniGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //13.Мини-игра в слова. Первый игрок вводит слово.
        // Потом второй игрок вводит два числа, с какого по какой символ можно найти слово внутри исходного,
        // используя substring. Потом первый игрок вводит два числа.
        // Побеждает тот, чье слово длиннее.
        // Пример:1: революционный2: 0 3 (вывод: рев)1: 7 13 (вывод: ионный)Победил игрок 1
        System.out.println("1 игрок вводит слово ");
        String player1 = sc.nextLine();
        System.out.println("2 игрок состовляет слова из ввода 1 игрока " + player1);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("2 игрок составил");
        System.out.println("Дальше очердь 1 игрока составить слово");
        int first1 = sc.nextInt();
        int second1 = sc.nextInt();
        if (first > first1 && second > second1) {
            System.out.println("1 win " + player1.substring(first, second));
            System.out.println("слово 2 игрока " + player1.substring(first1, second1));
        } else if (first1 > first && second1 > second) {
            System.out.println("2 win " + player1.substring(first1, second1));
            System.out.println("слово 1 игрока " + player1.substring(first, second));
        }

    }


}











