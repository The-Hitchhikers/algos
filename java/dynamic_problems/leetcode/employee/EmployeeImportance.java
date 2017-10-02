
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuriitsap.
 */

public class EmployeeImportance {

    public static void main(String[] args) {
	List<Employee> employees = new ArrayList<>();
	Employee first = new Employee();
	first.id = 1;
	first.importance = 2;
	ArrayList<Integer> firstEmployeeSubordinates = new ArrayList<>();
	firstEmployeeSubordinates.add(2);
	first.subordinates = firstEmployeeSubordinates;
	employees.add(first);
	Employee second = new Employee();
	second.id = 2;
	second.importance = 3;
	second.subordinates = new ArrayList<>();
	employees.add(second);
	System.out.print(new EmployeeImportance().getImportance(employees, 2));
    }

    public int getImportance(List<Employee> employees, int id) {
	if (employees == null) {
	    return 0;
	}
	boolean[] isSubordinate = new boolean[employees.size() + 1];
	isSubordinate[id] = true;
	int importance = 0;
	for (Employee current : employees) {
	    if (isSubordinate[current.id]) {
		for (Integer subordinateId : current.subordinates) {
		    isSubordinate[subordinateId] = true;
		}
		importance += current.importance;
	    }
	}
	return importance;
    }

    // Employee info
    private static class Employee {

	// It's the unique id of each node;
	// unique id of this employee
	public int id;
	// the importance value of this employee
	public int importance;
	// the id of direct subordinates
	public List<Integer> subordinates;
    }

}
