package ExerciseBasicSyntax;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Входни данни.
        int lostGameCount = Integer.parseInt(scanner.nextLine());// брои загубени игри
         double headsetPrice = Double.parseDouble(scanner.nextLine());// цена за слусхалки 1
         double mousePrice = Double.parseDouble(scanner.nextLine());// цена ЗА мишка
         double keyboardPrice = Double.parseDouble(scanner.nextLine()); // цена клавиатура
         double displayPrice = Double.parseDouble(scanner.nextLine()); // цена за монитор

        //2. брои артикули от всеки вид
        int headsetCount = lostGameCount / 2;// брой счупени слушалки
        int mouseCount = lostGameCount / 3; // брой счупени мишки
        int keyboardCount = lostGameCount / 6; // брой счупени клавиатури
        int displayCount =  lostGameCount / 12; // брой счупени монитори

        //3. обшата цена = цена слушалки + цена мишки + цена калвиатура + цена монитори
        double totalPrice = (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);


        System.out.printf("Rage expenses: %.2f lv.",totalPrice);






    }
}
