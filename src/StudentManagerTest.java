import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {

    @Test
    void testAddGrade() {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John", "Doe", "12345");
        assertTrue(studentManager.addGrade("12345", "Math", 4.5));
    }
}
