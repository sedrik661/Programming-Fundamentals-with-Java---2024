package ExerciseBasicSyntax;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int number = 1; number <= row; number++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
