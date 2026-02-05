package hrms.manager;

import hrms.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        if (findEmployeeByID(e.getEmployeeID()) != null)
            return false;
        employees.add(e);
        return true;
    }

    public Employee findEmployeeByID(String id) {
        for (Employee e : employees)
            if (e.getEmployeeID().equalsIgnoreCase(id))
                return e;
        return null;
    }

    public List<Employee> findEmployeesByName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees)
            if (e.getFullName().toLowerCase().contains(name.toLowerCase()))
                result.add(e);
        return result;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
