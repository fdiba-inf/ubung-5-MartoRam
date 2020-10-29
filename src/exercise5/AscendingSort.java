package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Sort numbers in ascending order
        int tempo=0;
        for (int i=0;i<numbers.length-1;i++)
        {
            for (int i2 = i + 1; i2 < numbers.length; i2++)
            {
                if (numbers[i]>numbers[i2])
                {
                    tempo=numbers[i2];
                    numbers[i2]=numbers[i];
                    numbers[i]=tempo;
                }
            }
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
