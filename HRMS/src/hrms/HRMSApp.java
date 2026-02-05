package hrms;

import hrms.manager.*;
import hrms.model.*;
import java.time.LocalDate;

public class HRMSApp {
    public void start() {
        EmployeeManager em = new EmployeeManager();
        AttendanceManager am = new AttendanceManager();

        Employee e1 = new FullTimeEmployee(
                "E01", "Nguyen Van A", "HR", "Manager",
                LocalDate.of(2023,1,1), 1000, 200);

        em.addEmployee(e1);

        am.recordAttendance("E01", LocalDate.now(), "Present", 2);

        System.out.println(e1);
        System.out.println("Working days: " +
                am.getTotalWorkingDays("E01", LocalDate.now().getMonthValue(), LocalDate.now().getYear()));
    }
}
