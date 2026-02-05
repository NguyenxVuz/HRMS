package hrms.model;
import java.time.LocalDate;
public class Attendance {
    private String employeeID;
    private LocalDate date;
    private String status;
    private int overtimeHours;

    public Attendance() {
    }

    public Attendance(String employeeID, LocalDate date, String status, int overtimeHours) {
        this.employeeID = employeeID;
        this.date = date;
        this.status = status;
        this.overtimeHours = overtimeHours;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return "Attendance{" + "employeeID=" + employeeID + ", date=" + date + ", status=" + status + ", overtimeHours=" + overtimeHours + '}';
    }
    
    
    
}
