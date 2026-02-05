package hrms.model;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(String id, String name, String dept, String job,
                            LocalDate joinDate, double salary, double allowance) {
        super(id, name, dept, job, "Full-time", joinDate, salary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double calculateMonthlySalary(int month, int year) {
        return basicSalary + allowance;
    }
}
