import java.util.Scanner;
public class studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String name;
      name= "Vissu"; 
      int rollno= sc.nextInt();
      long mobile=sc.nextLong();
      float cgpa=sc.nextFloat();
      System.out.println("Name:" +name);
      System.out.println("Roll no:" +rollno);
      System.out.println("Mobile:" +mobile);
      System.out.println("Cgpa:" +cgpa);


	}

}
