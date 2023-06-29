package com.tasks;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class FirstTaskTest {
    private static final String HELLO = "Привет";
    private final FirstTask task = new FirstTask();

    @Test(description = "Тест с числом меньше семи")
    public void testCheckStrIsLessSeven() {
        assertNull(task.checkStr("5"), "5 меньше семи");
    }

    @Test(description = "Тест с числом больше семи")
    public void testCheckStrIsMoreSeven() {
        assertEquals(task.checkStr("8"), HELLO, "8 больше семи");
    }

    @Test(description = "Тест с числом с плавающей точкой больше семи")
    public void testCheckStrIsMoreSevenFloat() {
        assertEquals(task.checkStr("7.01"), HELLO, "7.01 больше семи");
    }

    @Test(description = "Тест с числом с плавающей точкой меньше семи")
    public void testCheckStrIsLessSevenFloat() {
        assertNull(task.checkStr("6.999"), "6.999 меньше семи");
    }

    @Test(description = "Тест с числом семь")
    public void testCheckStrIsSeven() {
        assertNull(task.checkStr("7"), "7 не попадает в выбранный диапазон");
    }

    @Test(description = "Тест со строкой")
    public void testCheckStrIsStr() {
        assertNull(task.checkStr("test"), "Введена строка, а не число");
    }

    @Test(description = "Тест c пустой строкой")
    public void testCheckStrIsEmptyStr() {
        assertNull(task.checkStr(""), "Введена пустая строка, а не число");
    }

    @Test(description = "Тест c null")
    public void testCheckStrIsNull() {
        assertNull(task.checkStr(null), "Введен NULL, а не число");
    }
}