package com.tasks;

import java.util.Scanner;

public class SecondTask {
    private static final String VYACHESLAV = "Вячеслав";
    private static final String HELLO = "Привет, %s";
    private static final String NO_NAME = "Нет такого имени";

    public void secondTask() {
        System.out.print("Введите имя: ");
        Scanner in = new Scanner(System.in);
        SecondTask secondTask = new SecondTask();
        System.out.println(secondTask.checkName(in.nextLine()));
    }

    public String checkName(String name) {
        if (name.equals(VYACHESLAV)) {
            return String.format(HELLO, VYACHESLAV);
        } else {
            return NO_NAME;
        }
    }
}