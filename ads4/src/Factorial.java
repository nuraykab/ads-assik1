import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int num = scanner.nextInt();
        long factorial = findFactorial(num); 
        System.out.println("Факториал числа " + num + ": " + factorial);
        scanner.close();
    }

    // Complexity: linear - O(N)
    public static long findFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
