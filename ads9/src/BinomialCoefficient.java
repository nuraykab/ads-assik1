import java.util.Scanner;

public class BinomialCoefficient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        System.out.print("");
        int k = scanner.nextInt();

        int result = calculateBinomialCoefficient(n, k);
        System.out.println(result);

        scanner.close();
    }

    // Complexity: linear - 0(N)
    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
    }
}
