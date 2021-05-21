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

    public static void height(String height){

        Scanner in = new Scanner(System.in);
        System.out.print(height);
        int num = Integer.parseInt(in.nextLine());

        while (num > 1){
            if ( num % 2 == 0 )
                num = num / 2;
            else
                num = 3 * num + 1;
        }
    }
}
