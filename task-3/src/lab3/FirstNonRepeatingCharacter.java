package lab3;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        String S1= s1.toLowerCase();
        char[] a1 = S1.toCharArray();
        boolean found = false;

        for (int i = 0; i < a1.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < a1.length; j++) {
                if (i != j && a1[i] == a1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First Non-Repeating alphabet is " + a1[i]);
                found = true;
                break;
            }
        }

	}
}