package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id: " +id);
		
		
	}
public void getStudentInfo(int id,String stud_Name) {
		
	System.out.println("Student id: " +id);
	System.out.println("Student Name: "+stud_Name);
	}
public void getStudentInfo(String email,long stud_phno) {
	
	System.out.println("Student Email id : " +email);
	System.out.println("Student Student Phonenumber: " +stud_phno);
}
public static void main(String[] args) {
	Students st=new Students();
	st.getStudentInfo(123467);
	st.getStudentInfo(123457, "Shanmugapriya");
	st.getStudentInfo("Skpriya@gmail.com",1234567890);
}

}
