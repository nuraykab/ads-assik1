import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(": ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println(":");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = calculateAverage(arr);
        System.out.println(": " + average);
        scanner.close();
    }

    // Complexity: constant or linear, depending on the size of the input array
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
