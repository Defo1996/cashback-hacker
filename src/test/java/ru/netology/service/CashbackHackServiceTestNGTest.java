package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNGTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100WhenAmount900() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected, "Для суммы 900 руб. нужно докупить 100 руб.");
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Для суммы 1000 руб. не нужно ничего докупать.");
    }

    @Test
    public void shouldReturn500WhenAmount500() {
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected, "Для суммы 500 руб. нужно докупить 500 руб.");
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected, "Для суммы 1 руб. нужно докупить 999 руб.");
    }
}