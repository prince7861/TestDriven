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

    public void singleValueToAdd()
    {
        assertEquals(sc.add("1"),1);
    }
    public void addTwoNumsByComma()
    {
        assertEquals(sc.add("1,2"),3);
    }
    public void allowunknownamt()
    {
        assertEquals(sc.add("2,3,4,5,6,7,8,9"),0);
    }

}
