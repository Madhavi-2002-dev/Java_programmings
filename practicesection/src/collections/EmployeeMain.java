package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static List sortingSalary(List<Employe> list)
	{
	    return	list.stream().sorted(Comparator.comparing(Employe::getSalary)
				.thenComparing(Employe::getName).reversed()).collect(Collectors.toList());
	}
	

	public static void main(String[] args) {
		
		
		List<Employe>employeeList=new ArrayList<>();
		
		employeeList.add(new Employe("Rithvic", 50000));
		employeeList.add(new Employe("kajal", 660000));
		employeeList.add(new Employe("kali", 30000));
		employeeList.add(new Employe("Dingi", 30000));
		
		
		List sortedList=sortingSalary(employeeList);
		sortedList.forEach(System.out::println);

		// TODO Auto-generated method stub

	}

}
