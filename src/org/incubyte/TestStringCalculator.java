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

    public void emptyStringReturnsZero() throws Exception {
        assertEquals(sc.add(""),0);
    }

    public void singleValueToAdd() throws Exception {
        assertEquals(sc.add("1"),1);
    }
    public void addTwoNumsByComma() throws Exception {
        assertEquals(sc.add("1,2"),3);
    }
    public void allowUnknownAmtNos() throws Exception {
        assertEquals(sc.add("1,2,3,4,5,6,7,8,9"),45);
    }
    public void newLineDelimiterSum() throws Exception {
    assertEquals(sc.add("1\n2,3"),6);
    }
    public void multipleDelimiterSum() throws Exception {
        assertEquals(sc.add("1,2\n"),3);
    }


    @Test(expectedExceptions = Exception.class)
    public void negativeInputReturnsException() throws Exception {
       sc.add("-1");
    }

}
