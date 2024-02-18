import java.util.Scanner;

public class exerciseNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth fibonacci sequence: "); //Ask user for input

        int position = scanner.nextInt();
        int fibonacciNumber = fibonacci(position);

        System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);

        // Time complexity
        System.out.println("""


                 The time complexity of the code is exponential, O(2^n).\s
                which means that as the position of the Fibonacci number increases, the execution time grows rapidly.
                 So, if you choose a larger position, the code will take much longer to run.""");
    }

    /* Recursive call, the function keeps calling itself until it reached the lowest n value which is 1
    then adds it all*/
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
