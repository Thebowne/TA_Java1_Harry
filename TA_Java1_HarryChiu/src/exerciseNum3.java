public class exerciseNum3 {
    public static void main(String[] args) {
        int[] arraySample = {100, 521, -76, -12, 174};
        boolean trueFalse = false; //Placeholder for true/false

        //Iterate through every element to find if any of them equals to 0 or -1
        for (int i = 0; i < arraySample.length; i++) {
            if (arraySample[i] == 0 || arraySample[i] == -1) {
                trueFalse = true;
                break;
            }
        }

        if (trueFalse) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        // Time complexity
        System.out.println("""


                 The time complexity of this exercise is:\s
                The time complexity of the code is O(n),
                 As the array gets bigger, the code takes more time to run.""");

    }
}