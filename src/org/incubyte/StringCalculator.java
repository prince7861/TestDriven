package org.incubyte;

public class StringCalculator {

    private final String delimiter=",|\n";

    public int add(String numbers) throws Exception {
        String[]strnum=numbers.split(delimiter);
        if (isEmpty(numbers)) {
            return 0;
        }
        if (numbers.length() == 1) {
            return convertToInt(numbers);
        }
        else {
            //return getSum(num1[0], num1[1]);
            return getSumarr(strnum);

        }
    }
private int getSumarr(String[] numbers) throws Exception {
        nullCheckerException(numbers);
    int sum=0;
    for(String curr:numbers)
         {
             sum+=convertToInt(curr);
    }
    return sum;
}
    private  void nullCheckerException(String[] numbers) throws Exception {
        for (String curr:numbers)
        {
            if(convertToInt(curr)<0)
            {
                throw new Exception("Negative value");
            }
        }
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
