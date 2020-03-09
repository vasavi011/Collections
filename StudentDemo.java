package Array;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		//set values
		s1.setRollNumber(111);
		s1.setStudentName("Arun");
		s1.setMarks(416);
		s1.setGrade((byte)'A');

		Student s2 = new Student();
		s2.setRollNumber(112);
		s2.setStudentName("arun");
		s2.setMarks(303);
		s2.setGrade((byte)'B');
		//create an array of Student Object
		Student stuarray[] = {s1,s2};
		//create a collection an arraylist
		//ArrayList stucollection = new ArrayList();

		ArrayList<Student> stucollection = new ArrayList<Student>();
		//add elements to Arraylist
		stucollection.add(s1);
		stucollection.add(s2);
		/*stucollection.add("Sivaram");
		stucollection.add(33.52f);*/
		System.out.println(stucollection);
		
		Studentnamecomparator sc = new Studentnamecomparator();
		if(sc.compare(s1, s2)==1)
		{
			System.out.println("Both the objects have same name");
		}
		else{
			System.out.println("Both the objects have different name");
			}

			
	}

}
