import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int a = scanner.nextInt();
        System.out.print("");
        int n = scanner.nextInt();
        long result = power(a, n);
        System.out.println(result);
        scanner.close();
    }

    // Complexity: linear - 0(N)
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return a * power(a, n - 1);
        }
    }
}
