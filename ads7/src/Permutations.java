import java.util.HashSet;
import java.util.Set;

public class Permutations {

    public static void main(String[] args) {
        String str = "IOX";
        printPermutations(str, 0, str.length() - 1);
    }

    public static void printPermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            Set<Character> used = new HashSet<>();
            for (int i = start; i <= end; i++) {
                if (!used.contains(str.charAt(i))) {
                    used.add(str.charAt(i));
                    swap(str, start, i);
                    printPermutations(str, start + 1, end);
                    swap(str, start, i); // backtrack
                }
            }
        }
    }
    // Complexity: linear - 0(N)
    public static void swap(String str, int i, int j) {
        char temp = str.charAt(i);
        str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1);
        str = str.substring(0, j) + temp + str.substring(j + 1);
    }
}