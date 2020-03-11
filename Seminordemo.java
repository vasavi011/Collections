package LMS_Activities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Participant
{
	private String participantName;
	public Participant(String participantName)
	{
		super();
		this.participantName = participantName;
		}
	@Override
	public String toString(){
		return "Particpant[paricipanName = " +participantName +"]";
	}
}

public class Seminordemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
List<Participant> group1 = new ArrayList();
List<Participant> group2 = new ArrayList();
List<String> seminarrooms = new ArrayList();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for(byte counter=1;counter<=10;counter++)
{
	System.out.println("Enter Participant name:");
	if(counter<=5)
	{
		group1.add(new Participant(br.readLine()));
	}else
	{
		group2.add(new Participant(br.readLine()));
	}
	if(counter%5==0)
	{
		System.out.println("Enter seminar room name");
		seminarrooms.add(br.readLine());
	}
}
System.out.println("Group1:");
System.out.println(seminarrooms.get(0));
display(group1);
System.out.println("Group 2:");
System.out.println(seminarrooms.get(1));
display(group2);
	}
public static void display(List<Participant> al)
{
	for(Participant p : al)
	{
		System.out.println(p);
	}
}
	



	}

