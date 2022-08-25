public class whileLoop {
    public static void main(String[] args)
    {
        int counter = 1;
        while(counter <=10)
        {
            System.out.println("Since 1 will always be less than 10 hence printing an infinite loop using while loop");
            System.out.println(counter); //how many times it will print the above statement will print
            counter = counter +1; //breaking condition
        }
    }
}
