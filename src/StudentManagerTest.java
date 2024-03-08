import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class StudentManagerTest {

    @Test
    void testAddStudent() {
        StudentManager studentManager = new StudentManager();
        assertTrue(studentManager.addStudent("John", "Doe", "12345"));
    }
}
