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

    public Employee(String employeeID, String fullName, String department,
                    String jobTitle, String employmentType,
                    LocalDate dateOfJoining, double basicSalary) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.department = department;
        this.jobTitle = jobTitle;
        this.employmentType = employmentType;
        this.dateOfJoining = dateOfJoining;
        this.basicSalary = basicSalary;
        this.status = "Active";
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isEmpty())
            this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (!department.isEmpty())
            this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (!jobTitle.isEmpty())
            this.jobTitle = jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0)
            this.basicSalary = basicSalary;
    }

    public abstract double calculateMonthlySalary(int month, int year);

    @Override
    public String toString() {
        return employeeID + " | " + fullName + " | " + department + " | " +
               jobTitle + " | " + employmentType + " | Salary: " + basicSalary;
    }
}
