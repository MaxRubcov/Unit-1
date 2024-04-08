package ru.netelogy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {

    @Test
    public void shouldAdviseBuyMore() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);


    }
    @Test
    public void shouldNotAdviseBuyMore() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);


    }

}