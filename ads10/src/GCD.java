import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int a = scanner.nextInt();
        System.out.print("");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);
        System.out.println(gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
