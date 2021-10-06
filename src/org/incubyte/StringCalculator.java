package org.incubyte;

public class StringCalculator {

    public int add(String numbers) {
        String[] num1=numbers.split(",");

        if (isEmpty(numbers)) {
            return 0;
        }
        if (numbers.length() == 1) {
            return convertToInt(numbers);
        }
        else {
            return getSum(num1[0],num1[1]);
        }
    }

    private int getSum(String numA, String numB)
    {
        return Integer.parseInt(numA) +Integer.parseInt(numB);
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
