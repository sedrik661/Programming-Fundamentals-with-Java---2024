package ExerciseBasicSyntax;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int numbersSum = 0;


        for (int num = number1; num <= number2 ; num++) {
            System.out.printf("%d ",num);
            numbersSum += num;

        }
        System.out.printf("%nSum: " + numbersSum);




    }
}
