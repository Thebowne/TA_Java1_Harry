import java.util.Scanner;

public class exerciseNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of your array: "); //Ask user for array length/size
        int size = scanner.nextInt();

        int[] arraySize = new int[size];

        System.out.println("Enter the integers for your array: "); // Ask user for array elements
        for(int i = 0; i < size; i++){
            System.out.println("Integer " + (i+1) +":");
            arraySize[i] = scanner.nextInt();
        }

        int maxValue = arraySize[0]; // 'Placeholder' for max value

        // Iterate through every element in list to find the largest number
        for(int i = 0; i < size; i++) {
            if (arraySize[i] >  maxValue) {
                maxValue = arraySize[i];
            }
        }
        System.out.println("The maximum value of this array is: " + maxValue);


        // Time complexity
        System.out.println("""
                
                
                The time complexity of the code above is represented as O(n)
                where n is the size of the array. The larger the array size,
                 the longer it takes to execute the code""");
    }
}