import java.util.Scanner;

public class PasswordStrengthCheck {
    private void Password() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter your password:");
        String input = in.nextLine();
        Password p = new Password(input);
        System.out.println(p.calculateScore());
        in.close();
    }
}
