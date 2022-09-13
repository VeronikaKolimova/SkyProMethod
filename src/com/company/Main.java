package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        findLeapYear(2021);
        print();
        int currentYear = LocalDate.now().getYear();
        // int currentYear = 2022;
        setOS(currentYear);
        print();
        bankCardDeliveryDay(259);
        print();

       // checkForDuplicates("adfkg2");

        checkForDuplicates("aabccddefgghiijjkk");

    }


    public static void print() {
        System.out.println("***********************");
    }

    // Задание 1.
    public static int findLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год — високосный год.");
        } else System.out.println(leapYear + " год - не високосный год.");
        return leapYear;
    }

    // Задание 2.
    public static void setOS(int clientDeviceYear) {
        boolean setOS = true;
        if (setOS) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            //int clientDeviceYear = 2015;
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else {
            System.out.println("Установите версию приложения для Android по ссылке».");
            //int clientDeviceYear =0;
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }

    }

// Задание 3.

    public static int bankCardDeliveryDay(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDistance / 20);
        } else if (deliveryDistance >= 21 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance == 60)
            System.out.println("Потребуется дней: 3");

        else if (deliveryDistance > 60)
            System.out.println("Потребуется дней: " + (1 + ((deliveryDistance - 20) / 40)));

        return deliveryDistance;
    }

    // Задание 4.
/*Напишите метод, который в виде параметра принимает отсортированную строку.
    Например, aabccddefgghiijjkk.
    С помощью цикла проверьте, что в строке нет дублей, и выведите в консоль
    сообщение об этом.
    Если дубль найден, нужно прервать поиск по остальным символам и вывести
    сообщение о присутствии дубля, причем с указанием, какой именно символ
    задублирован. Затем сразу же прервать выполнение метода.
    Сам метод ничего возвращать не должен (void).
    Критерии оценки
– Метод написан корректно.
– В консоль выводится сообщения о наличии или отсутствии дублей.
– Программа прерывается при наличии дублей.
– При изменении значений строки программа отрабатывает корректно. */

// Задание 4.

    public static void checkForDuplicates(String s) {
        char c[] = s.toCharArray();

        for (int i = 0; i < c.length; i++)
            for (int j = i + 1; j < c.length; j++)
                if (c[j] == c[i]) {
                    System.out.println("В строке найден дубль.");
                    System.out.println(c[j]);
                    return;
                }
        for (int i = 0; i < c.length; i++)
            for (int j = i + 1; j < c.length; j++)
                if (c[j] != c[i]) {
                    System.out.println("В строке не найден дубль.");
                    return;
                }
    }
}









