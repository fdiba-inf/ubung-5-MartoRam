package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        boolean[] numnotuni = new boolean[numbers.length];
        // Find unique numbers in numbers

        int count=0;
        for (int i=0;i<numbers.length-1;i++)
        {
            for (int i2=i+1;i2<numbers.length;i2++)
            {
                if (numnotuni[i2]==true)
                {
                    continue;
                }
                else if (numbers[i]==numbers[i2])
                {
                    numnotuni[i2]=true;
                }
            }
        }
        for (int i3=0;i3<numbers.length;i3++)
        {
            if (numnotuni[i3]==false)
            {
                uniqueNumbers[count]=numbers[i3];
                count++;
            }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
