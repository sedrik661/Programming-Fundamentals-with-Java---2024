package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int startCode = Integer.parseInt(scanner.nextLine());
       int finishCode = Integer.parseInt(scanner.nextLine());

        for (int code = startCode;code <= finishCode ; code++) {

            System.out.print((char) code + " ");



        }



    }
}
