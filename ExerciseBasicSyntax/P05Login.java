package ExerciseBasicSyntax;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0 ; position--) {

            char symbol = username.charAt(position);
            password += symbol;

        }
        String enterPasslord = scanner.nextLine();
        int countWorngPatents = 0;

        while (!enterPasslord.equals(password)){
            countWorngPatents ++;
            if (countWorngPatents == 4) {
                System.out.printf("User %s blocked!",username);
                return; // прекратява цялата прграма
            }

            System.out.println("Incorrect password. Try again.");

            enterPasslord = scanner.nextLine();
        }
        System.out.printf("User %s logged in.",username);



    }
}
