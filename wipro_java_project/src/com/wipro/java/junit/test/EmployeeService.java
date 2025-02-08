package com.wipro.java.junit.test;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    // 1. Add Employee
    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
    }

    // 2. Remove Employee by ID
    public boolean removeEmployee(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }

    // 3. Search Employee by ID
    public Employee searchEmployee(int id) {
        return employees.stream()
                        .filter(emp -> emp.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    // 4. Update Salary
    public boolean updateSalary(int id, double newSalary) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }

    // 5. Display All Employees
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees); // Return a copy to prevent external modification
    }

    // 6. Filter by Department
    public List<Employee> filterByDepartment(String department) {
        if (department == null || department.isEmpty()) {
            return Collections.emptyList();
        }
        return employees.stream()
                        .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                        .collect(Collectors.toList());
    }

    // 7. Sort Employees by Name
    public List<Employee> sortByName() {
        return employees.stream()
                        .sorted(Comparator.comparing(Employee::getName))
                        .collect(Collectors.toList());
    }

    // 8. Get Average Salary
    public double getAverageSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }
        return employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0.0);
    }
}
