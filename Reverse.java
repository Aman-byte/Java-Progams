import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number to be reversed");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;

        while (n!=0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        System.out.println(ans);

    }
}
