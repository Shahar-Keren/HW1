public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int last1 = 1;
        int last2 = 1;
        int curr_sum = 0;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(last2);
            if (last2 % 2 == 1)
                numOdd += 1; 
            curr_sum = last1 + last2;
            last2 = last1;
            last1 = curr_sum;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();               
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
