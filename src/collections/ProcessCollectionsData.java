package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import functionalinterfaces.Employee;

public class ProcessCollectionsData {

	public static void main(String[] args) {
		List<Integer> list4 = new ArrayList<>();
		list4.add(11);
		list4.add(12);
		list4.add(13);
		list4.add(14);
		list4.add(15);

		List<Integer> list5 = new ArrayList<Integer>();
		for (int eachNum : list4)
			if (eachNum % 2 == 0)
				list5.add(eachNum);
		System.out.println(list5);

//		Stream Collection methods
//		map(), filter() and reduce()

		List<Integer> list6 = list4.stream().filter(eachVal -> eachVal % 2 == 0).collect(Collectors.toList());
		System.out.println(list6);

		var list7 = list4.stream().filter(eachVal -> eachVal % 2 == 0).collect(Collectors.toList());
		System.out.println(list7);

		var set1 = list4.stream().map(eachVal -> eachVal * 5).collect(Collectors.toSet());
		System.out.println(set1);

		var sum = list4.stream().reduce(0, (val1, val2) -> val1 + val2);
		System.out.println(sum);

		List<EmployeeClass> empList = new ArrayList<EmployeeClass>();
		empList.add(new EmployeeClass("Ram", 1002, "SoftwareEngineer", 90000));
		empList.add(new EmployeeClass("Krish", 1001, "SoftwareEngineer", 75000));
		empList.add(new EmployeeClass("Shiv", 1003, "SoftwareEngineer", 80000));
		empList.add(new EmployeeClass("Kiran", 1004, "SoftwareEngineer", 85000));
		empList.add(new EmployeeClass("Raju", 1005, "SoftwareEngineer", 95000));
		empList.add(new EmployeeClass("Mahesh", 1006, "SoftwareEngineer", 100000));

		empList.stream().filter(eachEmp -> eachEmp.getName().startsWith("K") && eachEmp.getSalary() > 80000)
				.forEach(eachEmp -> System.out.println(eachEmp.name + " " + eachEmp.getSalary()));
		
		empList.stream().filter(eachEmp -> eachEmp.getSalary() > 80000)
		.forEach(eachEmp -> System.out.println(eachEmp.name + " " + eachEmp.getSalary()));

	}

}
