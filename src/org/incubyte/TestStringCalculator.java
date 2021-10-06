package org.incubyte;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestStringCalculator {
    public void emptyStringReturnsZero()
    {
        StringCalculator sc=new StringCalculator();
        assertEquals(sc.add(""),0);
    }

}
