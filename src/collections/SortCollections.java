package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import functionalinterfaces.Employee;

public class SortCollections {

	public static void main(String[] args) {

		List<Integer> list4 = new ArrayList<>();
		list4.add(20);
		list4.add(40);
		list4.add(10);
		list4.add(50);
		list4.add(30);

		System.out.println(list4);
		Collections.sort(list4);
		System.out.println(list4);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Ram", 1002, "SoftwareEngineer"));
		empList.add(new Employee("Krish", 1001, "SoftwareEngineer"));
		empList.add(new Employee("Shiv", 1003, "SoftwareEngineer"));

		System.out.println("--------------------Before Sorting the Employee list-------------------");

		for (Employee eachEmp : empList) {
			System.out.println(eachEmp.getEmpId() + " " + eachEmp.getName());
		}

		System.out.println("--------------------After Sorting the Employee list-------------------");
		Comparator<Employee> comp2 = (e1, e2) -> {
			if (e1.getEmpId() > e2.getEmpId())
				return 0;
			else
				return -1;
		};
		Collections.sort(empList, comp2);		
		
		for (Employee eachEmp : empList) {
			System.out.println(eachEmp.getEmpId() + " " + eachEmp.getName());
		}

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Ram", 2, "BTech"));
		studentList.add(new Student("Krish", 1, "BTech"));
		studentList.add(new Student("Shiv", 3, "BTech"));
		
		System.out.println("--------------------Before Sorting the Student list-------------------");		
		studentList.forEach(eachStudent->System.out.println(eachStudent.getRollNumber()+" "+eachStudent.getName()));
		
		System.out.println("--------------------After Sorting the Student list-------------------");
		Collections.sort(studentList);
		studentList.forEach(eachStudent->System.out.println(eachStudent.getRollNumber()+" "+eachStudent.getName()));
		
		
	}

}
