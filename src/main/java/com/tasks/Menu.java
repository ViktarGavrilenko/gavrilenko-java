package com.tasks;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            showMenu();
            Scanner in = new Scanner(System.in);
            switch (in.nextLine()) {
                case "1":
                    FirstTask firstTask = new FirstTask();
                    firstTask.firstTask();
                    break;
                case "2":
                    SecondTask secondTask = new SecondTask();
                    secondTask.secondTask();
                    break;
                case "3":
                    ThirdTask thirdTask = new ThirdTask();
                    thirdTask.thirdTask();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный ввод, попробуйте ещё раз");
            }
        }
    }

    public static void showMenu() {
        System.out.println("_______________________________");
        System.out.println("1. Задание с число больше семи.");
        System.out.println("2. Задание с именем Вячеслав.");
        System.out.println("3. Задание с массивом чисел.");
        System.out.println("4. Выход");
        System.out.print("Введите номер задания: ");
    }
}