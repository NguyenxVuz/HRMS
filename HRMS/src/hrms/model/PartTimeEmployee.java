package hrms.model;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, String dept, String job,
                            LocalDate joinDate, double hourlyRate) {
        super(id, name, dept, job, "Part-time", joinDate, 0, "ACTIVE");
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary(int month, int year) {
        return hourlyRate * 160;
    }
}
