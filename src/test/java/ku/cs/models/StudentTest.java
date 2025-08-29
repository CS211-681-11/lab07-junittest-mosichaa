package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentTest {

    Student me;
    @BeforeEach
    void init(){
        me = new Student("6710405176", "Model");
    }
    @Test
    void testChangeName() {
        me.changeName("oh hi");
        assertEquals("oh hi", me.getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore() {
        me.addScore(45.15);
        assertEquals(45.15, me.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 90 คะแนน")
    void testGrade() {
        me.addScore(90);
        assertEquals('A', me.grade());
    }

    @Test
    void testIsId() {
        assertTrue(me.isId("6710405176"));
        assertFalse(me.isId("6710405010"));
    }

    @Test
    void testIsNameContains() {
        assertTrue(me.isNameContains("M"));
        assertFalse(me.isNameContains("A"))
    }

    @Test
    void testToString() {
        assertEquals("{id: '6710405176', name: 'Model', score: 0.0}", me.toString());
    }
}