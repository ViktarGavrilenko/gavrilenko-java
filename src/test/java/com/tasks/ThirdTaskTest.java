package com.tasks;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ThirdTaskTest {
    private static final String DOES_NOT_MATCH = "Массив не соответствует требуемому";
    private final ThirdTask task = new ThirdTask();

    @Test(description = "Тест c разными числами")
    public void testSearchMultiplesOfThreeVarietyNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(-3);
        assertEquals(task.searchMultiplesOfThree(new String[]{"3", "5", "6", "-3", "46"}), list, DOES_NOT_MATCH);
    }

    @Test(description = "Тест без чисел кратных трем")
    public void testSearchMultiplesOfThreeNotMultiples() {
        List<Integer> list = new ArrayList<>();
        assertEquals(task.searchMultiplesOfThree(new String[]{"2", "5", "1", "-8", "4"}), list, DOES_NOT_MATCH);
    }

    @Test(description = "Тест с числами только кратными трем")
    public void testSearchMultiplesOfThreeAllMultiples() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(9);
        assertEquals(task.searchMultiplesOfThree(new String[]{"3", "6", "9", "9"}), list, DOES_NOT_MATCH);
    }

    @Test(description = "Тест с некорректными данными")
    public void testSearchMultiplesOfThreeWithInvalidData() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        assertEquals(task.searchMultiplesOfThree(new String[]{"3", "a", "-", "6"}), list, DOES_NOT_MATCH);
    }
}