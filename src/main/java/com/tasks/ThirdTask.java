package com.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {
    private static final int MULTIPLES_NUMBER = 3;

    public void thirdTask() {
        System.out.print("Введите массив чисел через пробел: ");
        Scanner in = new Scanner(System.in);
        String[] listNumbers = in.nextLine().split(" ");
        ThirdTask thirdTask = new ThirdTask();
        List<Integer> list = thirdTask.searchMultiplesOfThree(listNumbers);
        System.out.print("Элементы массива кратные трем: ");
        for (Integer aDouble : list) {
            System.out.print(aDouble + " ");
        }
        System.out.println();
    }

    public List<Integer> searchMultiplesOfThree(String[] listNumbers) {
        List<Integer> multiplesOfThree = new ArrayList<>();
        for (String listNumber : listNumbers) {
            try {
                int number = Integer.parseInt(listNumber);
                if (number % MULTIPLES_NUMBER == 0) {
                    multiplesOfThree.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println(listNumber + " не является целым числом");
            }
        }
        return multiplesOfThree;
    }
}