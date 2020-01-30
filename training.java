package com.javalessons;

import java.util.Scanner;

class cyclingCalculator {

    public static void main(String[] args) {
        Scanner cyclingScanner = new Scanner(System.in);
        int gradeCounter = 0;
        int total = 0;
        System.out.println("Сколько км ты хочешь проехать  22 февраля? (отрицательное число  для выхода)");
        int km1 = cyclingScanner.nextInt();


        while (km1 > 0) {
            total = total + km1;
            gradeCounter++;

            System.out.println("Сколько км ты хочешь проехать  23 февраля?(отрицательное число  для выхода)");
            km1 = cyclingScanner.nextInt();

            }

        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.println("Значит за выходные будет проехано " + total);
            System.out.println("В среднем" + average + "км в день");
        } else
            System.out.println( "Ты не ввел данные");


       if (gradeCounter >1)
       {double average = (double) total / gradeCounter;
      if (average >= 120) {
           System.out.println("А ты затейник!");
       } else System.out.println("Это только для разминки?");
    }}

}



