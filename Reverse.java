import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n!=0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        System.out.println("Enter the number to be reversed");
        System.out.println(ans);

    }
}
