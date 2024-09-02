import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (isArmStrong(n)) {
            System.out.println("The number " + n + " is an Armstrong Number.");
        } else {
            System.out.println("The number " + n + " is not an Armstrong Number.");
        }
    }

    /**
     * Check if a number is an Armstrong number
     * @param n The number to check
     * @return true if n is an Armstrong number, false otherwise
     */
    public static boolean isArmStrong(int n) {
        int originalNum = n;
        int numberOfDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }

        return sum == originalNum;
    }
}
