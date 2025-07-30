import java.util.Scanner;
public class modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num1:\t");
		int a=sc.nextInt();
		System.out.print("Enter Num2:");
		int b=sc.nextInt();
		int c=a%b;
		System.out.println("modulo is:" +c);
	}

}
