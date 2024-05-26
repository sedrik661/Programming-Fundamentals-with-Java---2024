package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int litersOnTank = 0;


        for (int i = 1; i <= count ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            litersOnTank += liters;

            if (litersOnTank > 255) {

                System.out.printf("Insufficient capacity!%n");

                litersOnTank -= liters;

            }

        }

        System.out.println(litersOnTank);




    }
}
