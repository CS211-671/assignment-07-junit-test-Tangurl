package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610405883", "Nakarin");
    }
    @Test
    void testAddScore() {
        s1.addScore(100);
        assertEquals(100, s1.getScore());
        s1.addScore(200);
        assertEquals(300, s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        s1.addScore(10);
        s1.addScore(40);
        assertEquals("D", s1.grade());
    }

    @Test
    void testChangeName() {
        s1.changeName("Tan");
        assertEquals("Tan", s1.getName());
    }

    @Test
    void testIsId() {
        assertTrue(s1.isId("6610405883"));
        assertFalse(s1.isId("6610406000"));
    }
}