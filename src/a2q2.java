/*
    Name: Allen Keettikkal
    NSID: alk423
    Student Number: 11278995
 */

import java.util.Arrays;
import java.util.Scanner;

public class a2q2 {

    public static void main(String []args){
        height("Starting Height: ");
    }

    public static void height(String height){

        Scanner in = new Scanner(System.in);
        System.out.print(height);
        int heightNum = Integer.parseInt(in.nextLine());
        int counter = 0;

        while (heightNum > 1){
            if ( heightNum % 2 == 0 ){
                heightNum = heightNum / 2;
            }
            else{
                heightNum = 3 * heightNum + 1;
            }
            int[] heightArray = {heightNum};
            counter = counter + 1;
        }
        System.out.print("Number of Jumps: " + counter);
    }
}
