import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the two number");
        Scanner scn = new Scanner(System.in);
        int divident = scn.nextInt();
        int divisor = scn.nextInt();
      while (divident % divisior != 0) {
        int rem = divident % divisor;
        divident = divisor;
        divisor = rem; 
      }
      
      System.out.println(divisor);
    }
