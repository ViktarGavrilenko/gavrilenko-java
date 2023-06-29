package com.tasks;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SecondTaskTest {
    private static final String VYACHESLAV = "Вячеслав";
    private static final String HELLO = "Привет, %s";
    private static final String NO_NAME = "Нет такого имени";
    private final SecondTask task = new SecondTask();

    @Test(description = "Тест с имене Вячеслав")
    public void testCheckNameIsVyacheslav() {
        assertEquals(task.checkName(VYACHESLAV), String.format(HELLO, VYACHESLAV), "Было введено имя Вячеслав");
    }

    @Test(description = "Тест с именем Иван")
    public void testCheckNameIsNoVyacheslav() {
        assertEquals(task.checkName("Иван"), NO_NAME, "Было введено имя не Вячеслав");
    }

    @Test(description = "Тест с пустой строкой")
    public void testCheckNameIsEmptyStr() {
        assertEquals(task.checkName(""), NO_NAME, "Было введена пустая строка");
    }

    @Test(description = "Тест с именем вячеслав с маленьким регистром")
    public void testCheckNameIsInvalidCase() {
        assertEquals(task.checkName("вячеслав"), NO_NAME,
                "Было введено имя вячеслав в нижнем регистре, не соответствующее условию");
    }
}