package org.incubyte;

public class StringCalculator {

    public int add(String numbers)
    {
        if(isEmpty(numbers))
        {
            return 0;
        }
        return convertToInt(numbers);
    }

    private int convertToInt(String numbers)
    {
        return Integer.parseInt(numbers);
    }


    private boolean isEmpty(String numbers)
    {
        return numbers.isEmpty();
    }
}
