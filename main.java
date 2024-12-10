import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Max t = new Max(sc);
        System.out.println("The Maximum number is: " + t.getMax());
        // Test Case 1: 9, 5, 3
        // Output: 9
        // Test Case 2: 3, 10, 2
        // Output: 10
        // Test Case 3: 4, 7, 12
        // Output: 12
    }
}