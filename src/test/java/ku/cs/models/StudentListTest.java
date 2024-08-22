package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;

    @BeforeEach
    void init() {
        list = new StudentList();
    }

    @Test
    void testAddStudentAndFindStudentById() {
        list = new StudentList();
        list.addNewStudent("6610405883", "Tan");
        list.addNewStudent("6610405884", "Nat");
        list.addNewStudent("6610405885", "Ant");
        assertNotNull(list.findStudentById("6610405885"));
        assertNull(list.findStudentById("6610405886"));
    }

    @Test
    void testAddScore() {
        list.addNewStudent("6610405883", "Tan", 20);
        list.giveScoreToId("6610405883", 40);
        list.addNewStudent("6610405555", "Nat", 10);
        list.giveScoreToId("6610405555", 20);

        assertEquals(60, list.findStudentById("6610405883").getScore());
        assertNotEquals(50, list.findStudentById("6610405555").getScore());
    }

    @Test
    void testViewGradeOfId() {
        list.addNewStudent("6610405883", "Tan");
        list.addNewStudent("6610405884", "Nat");
        list.giveScoreToId("6610405883", 50);
        list.giveScoreToId("6610405884", 30);
        assertEquals("D", list.viewGradeOfId("6610405883"));
        assertNotEquals("A", list.viewGradeOfId("6610405884"));
    }

    @Test
    void testGetStudents() {
        assertEquals(0, list.getStudents().size());
        list.addNewStudent("6610405883", "Tan");
        list.addNewStudent("6610405884", "Nat");
        assertEquals(2, list.getStudents().size());
    }
}