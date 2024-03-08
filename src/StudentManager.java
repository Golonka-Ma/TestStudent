import java.util.HashMap;

public class StudentManager {

    private HashMap<String, String[]> students = new HashMap<>();

    public boolean addStudent(String name, String surname, String studentId) {
        students.put(studentId, new String[]{name, surname});
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
            return true;
        }
        return false;
    }
}
