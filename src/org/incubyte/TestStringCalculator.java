package org.incubyte;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestStringCalculator {
    private StringCalculator sc;

    @BeforeTest
    public void init()
    {
        sc=new StringCalculator();
    }

    public void emptyStringReturnsZero()
    {
        assertEquals(sc.add(""),0);
    }
/*
    public void allowunknownamt()
    {
        assertEquals(sc.add(""),0);
    }
    */
}
