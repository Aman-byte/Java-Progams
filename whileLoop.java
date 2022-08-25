import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args)
    {
        int counter = 1;
        while(counter <=10)
        {
            System.out.println("1 will always be less than 10 hence printing an infinite loop using while loop");
            counter = counter +1; //acts as a break
        }
    }
}
