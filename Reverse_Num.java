import java.util.Scanner;

public class Reverse_Num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse: ");
        int n = sc.nextInt();
        sc.close();
        int RevNum = rev(n);
        System.out.println("The reverse of the number you entered is: " + RevNum);



    }
    public static int rev(int n){
        int RevNum = 0;
        boolean isNegative = false;
    if(n<0){
        isNegative = true;
        n = Math.abs(n);

    }
    while(n>0){
        int digit = n % 10;
        RevNum = RevNum * 10 + digit;
        n /= 10;

    }
    if(isNegative){
        RevNum = -RevNum;

    }
    return RevNum;

    }

    @Override
    public String toString() {
        return "Reverse_Num []";
    }
}