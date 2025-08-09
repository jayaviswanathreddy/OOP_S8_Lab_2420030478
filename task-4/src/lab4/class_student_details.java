package lab4;

class class_student_details {
	private int rollno;
	float grade;
	public String name;

	public void setDetails(int rollno,float grade, String name) {
		this.rollno=rollno;
		this.grade=grade;
		this.name=name;
	}
	public void showDetails() {
		System.out.println("roll number:" +rollno);
		System.out.println("Grade:" +grade);
		System.out.println("Name:" +name);
	}
	
}