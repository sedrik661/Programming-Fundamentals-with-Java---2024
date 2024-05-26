package DataTypesAndVariablesExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        int sumNumber = number1 + number2;
        int sumNumber2 = sumNumber / number3;
        int finalNumber = sumNumber2 * number4;

        System.out.println(finalNumber);





    }
}
