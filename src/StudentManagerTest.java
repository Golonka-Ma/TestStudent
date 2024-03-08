import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {

    @Test
    void testRemoveStudent() {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John", "Doe", "12345");
        assertTrue(studentManager.removeStudent("12345"));
    }
}
