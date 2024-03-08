import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {

    @Test
    void testUpdateStudent() {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John", "Doe", "12345");
        assertTrue(studentManager.updateStudent("John", "Smith", "12345"));
    }

    @Test
    void testRemoveStudent() {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John", "Doe", "12345");
        assertTrue(studentManager.removeStudent("12345"));
    }

    @Test
    void testAddGrade() {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John", "Doe", "12345");
        assertTrue(studentManager.addGrade("12345", "Math", 4.5));
    }
    @Test
    void testCalculateAverageGrade() {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John", "Doe", "12345");
        studentManager.addGrade("12345", "Math", 4.5);
        studentManager.addGrade("12345", "Math", 3.5);
        assertEquals(4.0, studentManager.calculateAverageGrade("Math"));
    }
}
