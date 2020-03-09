package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Arraysortingdemo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int marks[] = {78,65,88};
		float sub_marks[] = new float[3];
		String subjects[]={"Maths","Physics","Chemistry"};
		int i=0;
		//display marks in stored manner
		for(int mark : marks)
		{
			System.out.println(subjects[i] + ":" +mark);
			i++;
		}
		//display marks in sorted manner
		Arrays.sort(marks);
		for(int mark : marks);
		//System.out.println(mark);
		//show marks in reverse order(descending order)
		System.out.println("Marks in revers order:");
		for(int l=marks.length-1;l>=0;l--)
		{
			System.out.println(marks[l]);
				
		}
		//create input stream reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//anonymous object
		//prompt user for input
		System.out.println("Enter marks for 3 subjeccts");
		//accept values into subject marks array
		for(i=0;i<sub_marks.length;i++)
		{
			sub_marks[i] = Float.parseFloat(br.readLine());
		}
		//display array in same order
		for(float sm : sub_marks)
		{
			System.out.println(sm);
		}

	}

}
