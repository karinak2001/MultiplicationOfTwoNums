import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // כתוב תרשים זרימה שמכפיל 2 מספרים מבלי להשתמש בפעולת הכפל, הדפס את
        //התוצאה.

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int sum = 0;

        System.out.println("Enter the first number (x): ");
        x = scanner.nextInt();


        System.out.println("Enter the second number (y): ");
        y = scanner.nextInt();


        //executes until the condition becomes false
        for (int i = 1; i <= x; i++) {

            //calculates the sum
            sum = sum + y;
        }

        System.out.println("The multiplication of " + x + " and " + y + " is: " + sum);
    }
    //Suppose, we want to multiply 3 by 4 which gives 12 as the result.
    // The same can be achieved by adding 3 four times i.e. (3 + 3 + 3 + 3 = 12)
    // or by adding 4 three times i.e. (4 + 4 + 4 = 12). Both give the same result.
    // Therefore, we can implement the logic using recursion.
}