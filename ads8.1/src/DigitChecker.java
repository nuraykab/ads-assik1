import java.util.Scanner;

public class DigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String s = scanner.nextLine();

        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    // Complexity: constant - 0(1)
    public static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
