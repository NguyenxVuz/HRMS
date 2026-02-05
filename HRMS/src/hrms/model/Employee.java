package hrms.model;
import java.time.LocalDate;
public abstract class Employee {
    protected String employeeID;
    protected String fullName;
    protected String department;
    protected String jobTitle;
    protected String employmentType;
    protected LocalDate dateOfJoining;
    protected double basicSalary;
    protected String status;
    public abstract double calculateMonthlySalary(int month, int year);

    public Employee() {
    }
    
    
    public Employee(String empoyeeID, String fullName, String department, String jobTitle, String employmentType, LocalDate dateOfJoining, double basicSalary, String status) {
        this.employeeID = empoyeeID;
        this.fullName = fullName;
        this.department = department;
        this.jobTitle = jobTitle;
        this.employmentType = employmentType;
        this.dateOfJoining = dateOfJoining;
        this.basicSalary = basicSalary;
        this.status = status;
    }

    public String getEmpoyeeID() {
        return employeeID;
    }

    public void setEmpoyeeID(String empoyeeID) {
        this.employeeID = empoyeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getEmployeeID() {
    return employeeID;
}

    @Override
    public String toString() {
        return "Employee{" + "empoyeeID=" + employeeID + ", fullName=" + fullName + ", department=" + department + ", jobTitle=" + jobTitle + ", employmentType=" + employmentType + ", dateOfJoining=" + dateOfJoining + ", basicSalary=" + basicSalary + ", status=" + status + '}';
    }
    
    
    
    
    
    
}

