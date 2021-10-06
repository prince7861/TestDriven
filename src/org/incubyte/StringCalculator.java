package org.incubyte;

public class StringCalculator {

    public int add(String numbers) {

       // String[] num1 = numbers.split(",");
        String[] splitArr = numbers.split(",");

        int[]arr=new int[splitArr.length];

        if (isEmpty(numbers)) {
            return 0;
        }
        if (numbers.length() == 1) {
            return convertToInt(numbers);
        }
        else {
            //return getSum(num1[0], num1[1]);
            int total= getSumarr(numbers);
                System.out.println(total);
                return total;
        }
    }
private int getSumarr(String sum)
{
    String[] splitArr = sum.split(",");

    int[]arr=new int[splitArr.length];
    for (int i=0;i<splitArr.length;i++)
    {
        arr[i]=Integer.parseInt(splitArr[i]);
    }
    int total=0;

    for (int i:arr) {
        total=total+i;
    }
    System.out.println(total);
    return total;
}
 /*  private int getSum(String numA, String numB)
    {
        return Integer.parseInt(numA) +Integer.parseInt(numB);
    }
  */

    private int convertToInt(String numbers)
    {
        return Integer.parseInt(numbers);
    }


    private boolean isEmpty(String numbers)
    {
        return numbers.isEmpty();
    }

}
