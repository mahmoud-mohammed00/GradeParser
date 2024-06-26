
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarksSheetTest {
    /**
     * Test of setSubject method, of class MarksSheet.
     */
    @Test
    public void testSetSubject() {
        Subject subj = new Subject("Testing", "CSE337s", 100);
        MarksSheet marksSheet = new MarksSheet();
        marksSheet.setSubject(subj);
        assertEquals(subj, marksSheet.getSubject());

    }

    /**
     * Test of addMark method, of class MarksSheet.
     */
    @Test
    public void testAddMark() {
        MarksSheet marksSheet = new MarksSheet();
        Student st = new Student("Karim", "1900511");
        StudentMarks mark = new StudentMarks(st, 10, 10, 20, 60);
        marksSheet.addMark(mark);
        assertTrue(marksSheet.getMarks().contains(mark));
    }

    @Test
    public void testAddMark_MultipleMarks() {
        MarksSheet marksSheet = new MarksSheet();
        Student st1 = new Student("Karim", "1900511");
        Student st2 = new Student("Ahmed", "1900512");
        StudentMarks mark1 = new StudentMarks(st1, 10, 10, 20, 60);
        StudentMarks mark2 = new StudentMarks(st2, 7, 0, 18, 55);
        marksSheet.addMark(mark1);
        marksSheet.addMark(mark2);
        // Assert that both marks are present in the marks list
        assertTrue(marksSheet.getMarks().contains(mark1));
        assertTrue(marksSheet.getMarks().contains(mark2));
    }

    /**
     * Test of toString method, of class MarksSheet.
     */
    @Test
    public void testToStringWithSingleStudent() {
        Subject sub = new Subject("Testing", "CSE337", 100);
        MarksSheet ms = new MarksSheet(sub);
        Student st = new Student("Karim", "1900511");
        StudentMarks mark = new StudentMarks(st, 10, 10, 20, 60);
        ms.addMark(mark);
        System.out.println(ms.toString());

    }

    @Test
    public void testToStringWithNoStudent() {
        Subject sub = new Subject("Testing", "CSE337", 100);
        MarksSheet ms = new MarksSheet(sub);
        System.out.println(ms.toString());

    }

    @Test
    public void testToStringWithMultipleStudents() {
        Subject sub = new Subject("Testing", "CSE337", 100);
        MarksSheet ms = new MarksSheet(sub);
        Student st1 = new Student("Karim", "1900511");
        Student st2 = new Student("Ahmed", "1900512");
        StudentMarks mark1 = new StudentMarks(st1, 10, 10, 20, 60);
        StudentMarks mark2 = new StudentMarks(st2, 7, 0, 18, 55);
        ms.addMark(mark1);
        ms.addMark(mark2);
        System.out.println(ms.toString());

    }

}
