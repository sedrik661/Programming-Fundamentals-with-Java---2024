package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberSymbol = Integer.parseInt(scanner.nextLine());
        int sumSymbol = 0;

        for (int i = 1; i <= numberSymbol ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sumSymbol += symbol;

        }
        System.out.printf("The sum equals: %d",sumSymbol);
    }
}
