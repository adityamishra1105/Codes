import java.util.Scanner;
public class Reverse_String {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to reverse: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);

        }
        System.out.println("Reversed String is: " + rev);


    }
}
