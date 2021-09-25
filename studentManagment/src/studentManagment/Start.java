package studentManagment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentData;

public class Start {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("welcome to student Managment APp");
		while(true)
		{
			System.out.println("enter 1 to add student");
			System.out.println("enter 2 to delete student ");
			System.out.println("enter 3 to display student ");
			System.out.println("enter 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			if(c==4) break;
			switch(c)
			{
			case 1: {   
				// add student
				System.out.println("enter user Name");
				String name=br.readLine();
				System.out.println("enter user phone");
				String pNum=br.readLine();
				System.out.println("enter user city Name");
				String cityN=br.readLine();
				Student student=new Student(name, pNum, cityN);
			boolean resBoolean=	 StudentData.insertStudentToDb(student);
			if (resBoolean==true) {
				System.out.println("data inserted or student is added successfully");
				
			}
			else System.out.println("some error encountered");
				
				break;
			}
			case 2:
			{
				//delet student
				System.out.println("Enter  student ID");
				int id=Integer.parseInt(br.readLine());
			Boolean resBoolean=	StudentData.deletStudent(id);
			if (resBoolean==true) {
				System.out.println("student id deleted");
			}
			else System.out.println("somrthing went wrong");
			break;
			}
			case 3:
			{
				//display
				
				StudentData.showStudents();
			}
			case 4:break;
			}
		}
		System.out.println("thanks ....see you soon");
		// TODO Auto-generated method stub

	}

}
