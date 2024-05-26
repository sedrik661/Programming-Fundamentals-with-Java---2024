package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;// сумата от цифрите


       while (number > 0){
        // 1.Последна цифра
           int lastDigit = number % 10;
        // 2. Сумиране
           sum += lastDigit;
        // 3. Изваждане на последната цифра
           number = number / 10;
       }
       // 4. Отпечатване
        System.out.println(sum);



    }
}
