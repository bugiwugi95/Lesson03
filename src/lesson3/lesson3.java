package lesson3;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("Введите строку и получите размер этой строки");
//        String str = sc.nextLine();
//        System.out.println(str.length());
//        //2
//        String first = sc.nextLine();
//        String second = sc.nextLine();
//        int res = first.length() + second.length();
//        System.out.println("first string: " + first);
//        System.out.println("second string: " + second);
//        System.out.println("length two is string: " + res);
        //3
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        String s3 = sc.nextLine();
//        int minString;
//        if (s1.length() < s2.length() && s1.length() < s3.length()) {
//            minString = s1.length();
//            System.out.println("s1 strok: " +  minString + " slovo: " + s1);
//        } else if (s2.length() < s1.length() && s2.length() < s3.length()) {
//            minString = s2.length();
//            System.out.println("s2 strok: " +  minString + " slovo: " + s2);
//        } else if (s3.length() < s1.length() && s3.length() < s2.length()){
//            minString = s3.length();
//            System.out.println("s3 strok: " +  minString + " slovo: " + s3);
//        }else {
//            System.out.println("neskolko strok или все ");
//        }
    //4
//        int u1 = sc.nextInt();
//        int u2 = sc.nextInt();
//        int u3 = sc.nextInt();
//        int cor;
//        if (Math.sqrt(u1) < 2) {
//            cor = u1;
//            System.out.println(Math.sqrt(u1));
//            System.out.println("u1: " + u1 + ":" + cor);
//        } else if (Math.sqrt(u2) < 2) {
//            cor = u2;
//            System.out.println(Math.sqrt(u2));
//            System.out.println("u2: " + u2 + ":" + cor);
//        } else if (Math.sqrt(u3) < 2) {
//            cor = u3;
//            System.out.println(Math.sqrt(u3));
//            System.out.println("u3: " + u3 + ":" + cor);
//        } else if (Math.sqrt(u1) < 2 && Math.sqrt(u2) < 2 && Math.sqrt(u3) < 2) {
//            System.out.println("u1,u2,u3");
//        } else {
//            System.out.println("xz");
//        }

        //6 ответ вывод 5 раз

        int x = 1;
        while (x >= -3) {
            System.out.print(x);
            x = x - 1;
        }

        //7 ответ 6 раз
        String str9 = "Hell";
        while(str9.length()<10){
            str9 = str9 + "o";
        }
    }



}











