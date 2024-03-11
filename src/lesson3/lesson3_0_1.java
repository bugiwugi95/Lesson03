package lesson3;

import java.util.Scanner;

public class lesson3_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //8
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//        double result;
//        if (first > second) {
//            result = (double) second / first;
//            System.out.println(second + "/" + first + "= " + result);
//        } else if (first < second) {
//            result = (double) first / second;
//            System.out.println(first + "/" + second + "= " + result);
//        }
        //9
//        String str = sc.nextLine();
//        System.out.println(str.substring(0,5));
        //10
//        boolean enter = sc.nextBoolean();
//        if (enter){
//            System.out.println("истина");
//        }else {
//            System.out.println("no");
//        }

        //11
//        int current1 = sc.nextInt();
//        int current2 = sc.nextInt();
//        int current3 = sc.nextInt();
//        boolean isCurrent = true;
//        if (current1 % 2 == 0) {
//            System.out.println("1" + isCurrent);
//            if (current1 > 1000) {
//                System.out.println("1" + isCurrent);
//            } else {
//                isCurrent = false;
//                System.out.println(isCurrent);
//            }
//        } else {
//            isCurrent = false;
//            System.out.println(isCurrent);
//        }
//        if (current2 % 2 == 0) {
//            System.out.println("2" + isCurrent);
//            if (current2 > 1000) {
//                System.out.println("2" + isCurrent);
//            } else {
//                isCurrent = false;
//                System.out.println(isCurrent);
//            }
//        } else {
//            isCurrent = false;
//            System.out.println(isCurrent);
//        }
//        if (current3 % 2 == 0) {
//            System.out.println("3" + isCurrent);
//            if (current3 > 1000) {
//                System.out.println("3" + isCurrent);
//            } else {
//                isCurrent = false;
//                System.out.println(isCurrent);
//            }
//        } else {
//            isCurrent = false;
//            System.out.println(isCurrent);
//        }
//
//
        //12
        System.out.println("Слова");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        System.out.println("Кол-во символов");
        int x = sc.nextInt();
        System.out.println(str1.substring(0, x) + ", " + str2.substring(0, x) + ", " + str3.substring(0, x) + ".");


    }


}











