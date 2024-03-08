import java.util.ArrayList;
import java.util.HashMap;

public class StudentManager {

    private HashMap<String, String[]> students = new HashMap<>();
    private HashMap<String, ArrayList<Double>> grades = new HashMap<>();

    public boolean addStudent(String name, String surname, String studentId) {
        students.put(studentId, new String[]{name, surname});
        grades.put(studentId, new ArrayList<>());
        return true;
    }

    public boolean updateStudent(String name, String surname, String studentId) {
        if (students.containsKey(studentId)) {
            students.put(studentId, new String[]{name, surname});
            return true;
        }
        return false;
    }

    public boolean removeStudent(String studentId) {
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            grades.remove(studentId);
            return true;
        }
        return false;
    }

    public boolean addGrade(String studentId, String subject, double grade) {
        if (students.containsKey(studentId)) {
            grades.get(studentId).add(grade);
            return true;
        }
        return false;
    }
}
