import java.util.Scanner;

// Custom Exception
class EmailException extends Exception {
    public EmailException() {
        super("Invalid Email");
    }
}

public class password {

    static void isValidEmail(String email) {
        int atAt = -1;
        int atCount = 0;
        int dotAt = -1;
        int dotCount = 0;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (ch == '@') {
                atAt = i;
                atCount++;
            }

            if (ch == '.') {
                dotAt = i;
                dotCount++;
            }
        }

        try {
            if (atCount != 1 || dotCount != 1 ||
                atAt > dotAt || dotAt - atAt <= 1) {
                throw new EmailException();
            }

            System.out.println("1");

        } catch (EmailException e) {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String email = sc.nextLine();
            isValidEmail(email);
        }

        sc.close();
    }
}