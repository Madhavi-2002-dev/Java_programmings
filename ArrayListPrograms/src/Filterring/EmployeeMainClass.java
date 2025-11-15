package Filterring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMainClass {
	
	public static List sortingSalary(List l) {
		List<Employee> sortedsalary =(List<Employee>) l.stream().sorted(Comparator.
				comparing(Employee::getSalary).
				thenComparing(Employee::getName)).collect(Collectors.toList());
		
		return sortedsalary;
	
	}
//	public static List modifySalaryByUsingRole(List<Employee> l)
//	{
//		List<Employee> updateList=l.stream().peek(e->{
//			if(e.getDepartment().equalsIgnoreCase("developer")) {
//				e.setSalary(e.getSalary()*0.9);
//			}
//		}).collect(Collectors.toList());
//		return updateList;
//	}
	
	
	
	  public static void modifySalarybyUsinMap(List<Employee> l) {
	  l.stream().map(emp -> {  if
	  (emp.getDepartment().equalsIgnoreCase("Developer")) 
	  emp.setSalary(emp.getSalary() * 0.9); 
	  return emp;  
	  }) 
	  .forEach(System.out::println); 
	  }
	 
	
	public static double findmaximumSalary(List<Employee> l)
	{
//		double maxSalary=l.stream().map(e->e.getSalary()).max((e1,e2)->Double.compare(e1,e2)).get();
		double maxSalary=l.stream().map(Employee::getSalary).max(Double::compare).get();
		return maxSalary;
	}
	
	
	public static void findSecondHighestSalary(List<Employee> l)
	{
		
          double secondhighSalary=l.stream().map(Employee::getSalary). 
		  sorted(Comparator.reverseOrder()).skip(1).findFirst()  .orElseThrow(()->new
		  RuntimeException("no second highest salaryelement")); 
		  System.out.println("secondHighest salary:"+secondhighSalary);
		 		/*
		 * Employee secondHighestEmp = l.stream()
		 * .sorted(Comparator.comparing(Employee::getSalary).reversed()) .distinct()
		 * .skip(1) .findFirst() .orElse(null); System.out.println(secondHighestEmp);
		 */
	}
	public static void searchDepartment(String dept,List<Employee> l)
	{
		/*
		 * long
		 * count=l.stream().filter(e->e.getDepartment().equalsIgnoreCase(dept)).count();
		 * if(count==0) { throw new RuntimeException("Department not found"); }
		 * System.out.println("employees in "+dept+":"+count);
		 */		Optional<Employee> emp=l.stream().filter(e->e.getDepartment().equalsIgnoreCase(dept))
				 .findAny();
              System.out.println(emp.orElseThrow(()->new RuntimeException("Departmentt not fount")));
	}
	public static List getEmployeeDetailesUsingDept(String dept,List<Employee> l) {
		List<Employee> emp=l.stream().filter(e->e.getDepartment()
				.equalsIgnoreCase(dept)).collect(Collectors.toList());
		return emp;
	}
	
	public static List getEmployeeNames(List<Employee> l) {
	return	l.stream().map(Employee::getName).collect(Collectors.toList());
		
	}
	
	static List sortSalarys(List<Employee> l){
		return l.stream().sorted(Comparator.
				comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
	}
	
	public static List sortingSalaryWithMultiConditions(List<Employee> l)
	{
		return l.stream().sorted(Comparator.comparing(Employee::getSalary)
				.thenComparing(Employee::getName)).collect(Collectors.toList());
	}
	
	public static List reducingSalary(List<Employee> l)
	{
		/*
		 * return l.stream().map(e->{
		 * if(e.getDepartment().equalsIgnoreCase("Developer")) {
		 * e.setSalary(e.getSalary()*0.9); } return e; }).collect(Collectors.toList());
		 */
		
		return l.stream().filter(e->e.getDepartment().equalsIgnoreCase("Developer"))
		.peek(e->e.setSalary(e.getSalary()*0.9)).collect(Collectors.toList());
			
		
	}
	
	public static double maximumSalary(List<Employee> l)
	{
       return l.stream().map(e->e.getSalary()).max((e1,e2)->Double.compare(e1, e2)).get();
    }
	public static double averageSalary(List<Employee> l)
	{
		return l.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
	}
	public static Map<String,List<Employee>> groupingEmployeUsingDept(List<Employee> l)
	{
		Map<String,List<Employee>> empByDept=l.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		return empByDept;
	}
	
	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee(2345678934l, "Raji", 100000, "developer");
		l.add(e1);
		l.add(new Employee(2346578910l, "Arya", 50000, "sql administration"));
		l.add(new Employee(1245678932l, "Siva", 90000, "HR"));
		l.add(new Employee(34567890l, "Dinga", 90000, "IT"));
		l.add(new Employee(1245876543l, "kavya", 16000, "Engineer"));
		l.add(new Employee(1209873456l, "Bob", 20000, "IT"));
//		System.out.println(sortingSalary(l));
//		System.out.println(modifySalaryByUsingRole(l));
//		System.out.println(l);
		System.out.println("***************************");
//		modifySalarybyUsinMap(l);
		/*
		 * System.out.println("********************"); System.out.println(l);
		 * System.out.println("********************");
		 * System.out.println("maxsalary:"+findmaximumSalary(l));
		 * System.out.println("***************************");
		 * findSecondHighestSalary(l);
		 * System.out.println("****************************");
		 * System.out.println("enter the department"); String departmant=sc.next();
		 * searchDepartment(departmant, l);
		 * System.out.println("*************************");
		 * System.out.println("enter the department"); String departmant1=sc.next();
		 * List newList=getEmployeeDetailesUsingDept(departmant1, l); for(Object
		 * e:newList) { System.out.println(e); }
		 * 
		 * System.out.println("**************************");
		 * System.out.println(getEmployeeNames(l));
		 * System.out.println("**********************"); List<Employee>
		 * result=sortSalarys(l); result.forEach(System.out::println);
		 */
		
//		List<Employee> result=sortingSalaryWithMultiConditions(l);
//		result.forEach(System.out::println);
//		
		
		/*
		 * List<Employee> udatesalary=reducingSalary(l);
		 * udatesalary.forEach(System.out::println);
		 */
		
//		System.out.println(maximumSalary(l));
		
//		System.out.println("averageSalary:"+averageSalary(l));
		
		Map<String,List<Employee>> groupingEmployee=groupingEmployeUsingDept(l);
		groupingEmployee.forEach((dept, employees) -> {
		    System.out.println("Department: " + dept);
		    employees.forEach(e -> System.out.println("   " + e));
		    System.out.println(); // blank line between departments
		});

	}

}
