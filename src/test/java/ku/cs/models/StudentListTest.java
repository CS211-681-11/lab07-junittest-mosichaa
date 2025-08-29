package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    private StudentList list;
    @BeforeEach
    void setUp() {
        list = new StudentList();
        list.addNewStudent("6710405176", "Model");
        list.addNewStudent("6710405177", "Model2");
        list.addNewStudent("6710405178", "Model3");
    }

    @Test
    void testAddNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("6710405010", "Note");
    }

    @Test
    void testFindStudentById() {
        assertNotNull(list.findStudentById("6710405176"));
    }

    @Test
    void testFilterByName() {
        list.addNewStudent("6710405001", "a1");
        list.addNewStudent("67104005002", "a2");
        list.addNewStudent("6710405003", "a3");

        assertEquals(3,list.filterByName("a").getStudents().size());
    }

    @Test
    void testGiveScoreToId() {
        list.giveScoreToId("6710405176",100);
        assertEquals(100,list.findStudentById("6710405176").getScore());
    }

    @Test
    void viewGradeOfId() {
        list.giveScoreToId("6710405176",100);
        assertEquals("A",list.findStudentById("6710405176").getGrade());
    }
}