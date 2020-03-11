package LMS_Activities;

import java.util.Vector;

class Student{

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
class Teacher{

	@Override
	public String toString() {
		return "Teacher [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
class Hod{

	@Override
	public String toString() {
		return "Hod [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

public class Vectordemo {

	public static void main(String[] args) {
		// create a vector colVector<E>n that allows any object
		Vector<Object> objlist = new Vector();
		objlist.add(new Student());
		objlist.add(new Teacher());
		objlist.add(new Hod());
		System.out.println(objlist);

	}

}
