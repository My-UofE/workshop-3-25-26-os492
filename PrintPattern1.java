import java.util.Scanner;

public class PrintPattern1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number:");
            int userNum = in.nextInt();
            // Outer loop to print each of the rows
            for (int row = 1; row <= userNum; row++) {
                // Inner loop to print each of the columns of a particular row
                for (int i = 1; i <= row; i++) {
                    System.out.print(i);
                }
            System.out.println("");
            }
            }
        }
