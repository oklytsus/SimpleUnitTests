package example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import s5.Student;
import s5.CreateStudent;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Зробити рефакторінг!!!!!!!


    private List<Student> studentCollection;

    @BeforeEach
    void setUp() {
        studentCollection = CreateStudent.createStudentCollection();
    }

    @AfterEach
    void tearDown() {
        studentCollection = null;
    }

    @Test
    void testContainsAnna() {
        assertTrue(containsAnna(), "Student collection should contain a student with name 'Anna'");
    }

    @Test
    void testCount2000BirthYear() {
        assertTrue(count2000BirthYear() > 0, "There should be students born in the year 2000");
    }

    @Test
    void testTotalNumberOfStudents() {
        assertEquals(5, studentCollection.size(), "Total number of students should be 5");
    }

    private static boolean containsAnna() {
        boolean containsAnna = false;
        List<Student> studentCollection = CreateStudent.createStudentCollection();
        for (Student student : studentCollection) {
            if (student.getFirstName().equals("Anna")) {
                containsAnna = true;
                break;
            }
        }
        return containsAnna;
    }

    private static int count2000BirthYear() {
        int count2000BirthYear = 0;
        List<Student> studentCollection = CreateStudent.createStudentCollection();
        for (Student student : studentCollection) {
            if (student.getBirthDate().startsWith("2000")) {
                count2000BirthYear++;
                break;
            }
        }
        return count2000BirthYear;
    }

}
