package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P02PoundsToollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(scanner.nextLine());

        double dollars = pound * 1.36;

        System.out.printf("%.3f",dollars);


    }
}
