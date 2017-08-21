package Employee;


import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void defaultEmployeeTest() {
        Employee testEmployee = new Employee(1, "Franek", "Dolas", 2700);
        Assert.assertEquals(1, testEmployee.getId());
        Assert.assertEquals("Franek", testEmployee.getFirstName());
        Assert.assertEquals("Dolas", testEmployee.getLastName());
        Assert.assertEquals(2700, testEmployee.getSalary());
    }
    @Test
    public void EmployeeGetIdTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 2700);
        Assert.assertEquals(4, testEmployee.getId());
    }
    @Test
    public void EmployeeGetFirstNameTest() {
        Employee testEmployee = new Employee(4, "Zenek", "Dolas", 2700);
        Assert.assertEquals("Zenek", testEmployee.getFirstName());
    }
    @Test
    public void EmployeeGetLastNameTest() {
        Employee testEmployee = new Employee(4, "Franek", "Wichura", 2700);
        Assert.assertEquals("Wichura", testEmployee.getLastName());
    }
    @Test
    public void EmployeeGetNameTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 2700);
        Assert.assertEquals("Franek Dolas", testEmployee.getName());
    }
    @Test
    public void EmployeeGetSalaryTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 3500);
        Assert.assertEquals(3500, testEmployee.getSalary());
    }
    @Test
    public void EmployeeSetSalaryTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 2700);
        testEmployee.setSalary(4500);
        Assert.assertEquals(4500, testEmployee.getSalary());
    }
    @Test
    public void EmployeeGetAnnualSalaryTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 2000);
        Assert.assertEquals(24000, testEmployee.getAnnualSalary());
    }
    @Test
    public void EmployeeRaiseSalaryTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 2000);
        Assert.assertEquals(2200, testEmployee.reiseSalary(10));
    }
    @Test
    public void EmployeeToStringTest() {
        Employee testEmployee = new Employee(4, "Franek", "Dolas", 2700);
        Assert.assertEquals("Employee[id=4, name=Franek Dolas, salary=2700]", testEmployee.toString());
    }
}
