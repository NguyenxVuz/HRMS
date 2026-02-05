package hrms.manager;

import hrms.model.Attendance;
import java.time.LocalDate;
import java.util.*;

public class AttendanceManager {
    private Map<String, List<Attendance>> attendanceRecords = new HashMap<>();

    public boolean recordAttendance(String empID, LocalDate date, String status, int ot) {
        attendanceRecords.putIfAbsent(empID, new ArrayList<>());
        attendanceRecords.get(empID).add(new Attendance(empID, date, status, ot));
        return true;
    }

    public List<Attendance> getAttendanceHistory(String empID) {
        return attendanceRecords.getOrDefault(empID, new ArrayList<>());
    }

    public int getTotalWorkingDays(String empID, int month, int year) {
        return (int) getAttendanceHistory(empID).stream()
                .filter(a -> a.getDate().getMonthValue() == month &&
                             a.getDate().getYear() == year &&
                             a.getStatus().equalsIgnoreCase("Present"))
                .count();
    }

    public int getTotalAbsenceDays(String empID, int month, int year) {
        return (int) getAttendanceHistory(empID).stream()
                .filter(a -> a.getDate().getMonthValue() == month &&
                             a.getDate().getYear() == year &&
                             a.getStatus().equalsIgnoreCase("Absent"))
                .count();
    }

    public int getTotalOvertimeHours(String empID, int month, int year) {
        return getAttendanceHistory(empID).stream()
                .filter(a -> a.getDate().getMonthValue() == month &&
                             a.getDate().getYear() == year)
                .mapToInt(Attendance::getOvertimeHours)
                .sum();
    }
}
