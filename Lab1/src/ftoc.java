import java.util.Scanner;
public class ftoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the celsius :\t");
       int cel=sc.nextInt();
       int fah= cel*(9/5)+32;
       System.out.println("Converted temparature is :" +fah);
	}

}
