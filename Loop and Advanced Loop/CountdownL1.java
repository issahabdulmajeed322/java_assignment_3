import java.util.Scanner;

public class CountdownL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nStart!");
        input.close();
    }
}
