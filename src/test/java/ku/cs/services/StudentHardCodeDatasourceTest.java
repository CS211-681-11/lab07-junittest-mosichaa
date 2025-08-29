package ku.cs.services;

import org.junit.jupiter.api.Test;
import ku.cs.models.StudentList;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testReadData() {
        StudentHardCodeDatasource x = new StudentHardCodeDatasource();
        StudentList list = x.readData();
        assertEquals(4, list.getStudents().size());
        assertNull(list.findStudentById("6710400001"));
        assertEquals(2, list.filterByName("i").getStudents().size());
    }
}