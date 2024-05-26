package ExerciseBasicSyntax;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входи данни
         double budget = Double.parseDouble(scanner.nextLine()); // наличен бюджет
         int countStudent = Integer.parseInt(scanner.nextLine()); // брй ученици / падуани
         double priceSaber = Double.parseDouble(scanner.nextLine());// цена за 1 меч
         double priceRob = Double.parseDouble(scanner.nextLine());// цена на 1 робата
         double priceBelt = Double.parseDouble(scanner.nextLine());// цена за 1 колан

        //2. по колко броя трябва да купимк от всеки артикул (мечове , роби ,колани)
        double countSaber = Math.ceil(1.10 * countStudent);// броят на мечовете които са нужни
        int countBelt = countStudent - countStudent / 6;// броят на коланите

        //3. общо сума за плащане
        double totalSum = (priceBelt * countBelt) + (priceSaber * countSaber) + (priceRob * countStudent);

        //4. дали бюджетът е достатъчен
        if (budget >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);

        }else {
            double nedetMoney = totalSum - budget;// ннужни пари
            System.out.printf("George Lucas will need %.2flv more.",nedetMoney);
        }



    }
}
