import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    // Complexity: linear - 0(N)
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
