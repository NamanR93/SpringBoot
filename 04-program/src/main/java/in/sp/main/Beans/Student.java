package in.sp.main.Beans;


public class Student {
	
	private String name;
	private int rollno;
	private int age;
	
	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void displayStdInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Rollno: "+ rollno);
		System.out.println("Age: "+ age);
		
	}
	
	
	
	
	
	

}
