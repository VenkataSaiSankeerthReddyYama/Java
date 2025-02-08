package com.wipro.java.junit.test;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class EmployeeServiceTest {
    private EmployeeService m;

    @Before
    public void setUp() {
        m = new EmployeeService();
        m.addEmployee(new Employee(1, "Alice", "IT", 50000.0, LocalDate.of(2022, 1, 10)));  // Changed John to Alice
        m.addEmployee(new Employee(2, "Bob", "HR", 60000.0, LocalDate.of(2021, 5, 20)));    // Changed Bhava to Bob
        m.addEmployee(new Employee(3, "Charlie", "Finance", 70000.0, LocalDate.of(2020, 8, 15)));  // Changed Tharini to Charlie
    }

    @Test
    public void testAddEmployee() {
        Employee emp = new Employee(4, "David", "IT", 55000.0, LocalDate.of(2023, 3, 5)); // Changed Michael to David
        m.addEmployee(emp);
        assertEquals(4, m.getAllEmployees().size());
    }

    @Test
    public void testRemoveEmployee() {
        assertTrue(m.removeEmployee(1));
        assertNull(m.searchEmployee(1));
    }

    @Test
    public void testSearchEmployee() {
        Employee emp = m.searchEmployee(2);
        assertNotNull(emp);
        assertEquals("Bob", emp.getName());  // Changed Bhava to Bob
    }

    @Test
    public void testUpdateSalary() {
        assertTrue(m.updateSalary(3, 80000.0));
        assertEquals(80000.0, m.searchEmployee(3).getSalary(), 0.01);
    }

    @Test
    public void testGetAllEmployees() {
        assertEquals(3, m.getAllEmployees().size());
    }

    @Test
    public void testFilterByDepartment() {
        List<Employee> itEmployees = m.filterByDepartment("IT");
        assertEquals(1, itEmployees.size());
        assertEquals("Alice", itEmployees.get(0).getName()); // Changed John to Alice
    }

    @Test
    public void testSortByName() {
        List<Employee> sortedEmployees = m.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getName());  // Changed John to Alice
        assertEquals("Bob", sortedEmployees.get(1).getName());    // Changed Michael to Bob
        assertEquals("Charlie", sortedEmployees.get(2).getName()); // Changed Tharini to Charlie
    }

    @Test
    public void testGetAverageSalary() {
        double avgSalary = m.getAverageSalary();
        assertEquals(60000.0, avgSalary, 0.01);
    }
}
