/*
    Name: Allen Keettikkal
    NSID: alk423
    Student Number: 11278995
 */

import java.util.Scanner;

public class a2q2 {

    public static void main(String []args){
        height("Starting Height: ");
    }

    public static void height(String height) {

        // Asks for an input height.
        Scanner in = new Scanner(System.in);
        System.out.print(height);

        // Initializing heightNum, counter and heightMax.
        int heightNum = Integer.parseInt(in.nextLine());
        int jumpNumber = 0;
        int heightMax = 0;
        int heightPrev;
        int streakPos = 0;
        int streakNeg = 0;

        // Checks if the height is greater than 1.
        while (heightNum > 1) {

            // Finding if the height drop is positive or negative and calculating the new height accordingly.
            if (heightNum % 2 == 0) {
                heightPrev = heightNum;
                heightNum = heightNum / 2;
            } else {
                heightPrev = heightNum;
                heightNum = 3 * heightNum + 1;
            }

            // Checks if the current height is greater than the previous height.
            if (heightNum > heightMax) {
                heightMax = heightNum;
            }

            if (heightNum > heightPrev) {
                streakPos += 1;
                streakNeg = 0;
            } else {
                streakNeg += 1;
                streakPos = 0;
            }

            // Counts every iteration of the while loop.
            jumpNumber += 1;
        }

        // Prints the results.
        System.out.print("Number of Jumps: " + jumpNumber + '\n');
        System.out.print("Maximum Height reached: " + heightMax + '\n');

        // Determines if the positive streak or negative streak should be printed:
        if (streakPos > streakNeg) {
            System.out.print("Maximum Streak reached: " + streakPos + '\n');
        } else {
            System.out.print("Maximum Streak reached: " + streakNeg + '\n');
        }
    }
}
