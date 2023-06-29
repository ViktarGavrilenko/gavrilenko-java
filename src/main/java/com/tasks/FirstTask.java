package com.tasks;

import java.util.Scanner;

public class FirstTask {
    private static final String HELLO = "Привет";
    private static final int NUMBER = 7;

    public void firstTask() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();
        String ans = firstTask.checkStr(in.nextLine());
        if (ans != null) {
            System.out.println(ans);
        }
    }

    public String checkStr(String str) {
        try {
            double number = Double.parseDouble(str);
            return number > NUMBER ? HELLO : null;
        } catch (NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}