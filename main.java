import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Max t = new Max();
        t.inputMaxInt(sc);
        System.out.println("The Maximum number is: " + t.getMaxInteger());
        t.inputMaxFloat(sc);
        System.out.println("The Maximum number is: " + t.getMaxFloat());

    }
}