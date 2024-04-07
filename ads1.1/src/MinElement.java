import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(":");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println(":");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMinRecursive(arr, n);
        System.out.println(":" + min);
        scanner.close();
    }

    // Complexity: linear - O(n)
    public static int findMinRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMinRecursive(arr, n - 1);
        if (arr[n - 1] < min) {
            min = arr[n - 1];
        }
        return min;
    }
}
