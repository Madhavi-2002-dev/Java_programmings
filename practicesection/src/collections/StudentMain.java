package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
	
	public static  void sortTheStudentListByCountCapitals(List<Student> list)
	{
		list.sort((s1,s2)->{
			int c1=countCapitals(s1.getName());
			int c2=countCapitals(s2.getName());
			return Integer.compare(c1, c2);
		});
		System.out.println("Sorted list by capital count:");
		 for (Student s : list) {
		        System.out.println(
		            "ID: " + s.getId() +
		            ", Name: " + s.getName() +
		            ", Marks: " + s.getMarks() +
		            ", Dept: " + s.getDepartment() +
		            ", DOB: " + s.getDateOfBirth() +
		            ", Capital Count: " + countCapitals(s.getName())
		        );
		    }

	}
	public static int countCapitals(String name)
	{
		int count=0;
		char arr[]=name.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(Character.isUpperCase(arr[i]))
			{
				count++;
			}
		}
		return count;
	}
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
		List<Student>studentList=new ArrayList<>();
		studentList.add(new Student("Madhavi", 101, 98, "MCA", "20-02-2004"));
		studentList.add(new Student("Bob", 102, 88, "IT", "10-02-2002"));

		studentList.add(new Student("AliceRathod", 103, 78, "MCA", "18-12-2003"));
		studentList.add(new Student("dinga", 104, 60, "ECE", "30-04-2002"));
		studentList.add(new Student("KalyanKanakala", 105, 99, "IT", "10-02-2020"));
		studentList.add(new Student("Lilly", 106, 34, "B.com", "16-05-2016"));
		
//		System.out.println(studentList);
		sortTheStudentListByCountCapitals(studentList);

	}

}
