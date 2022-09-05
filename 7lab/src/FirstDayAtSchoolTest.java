import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({ PrepareMyBagTest.class, AddPencilsTest.class })
class FirstDayAtSchoolTest {
    FirstDayAtSchool school = new FirstDayAtSchool();
    String[] bag1 = { "Books", "Notebooks", "Pens" };
    String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
    @Test
    void prepareMyBag() {
        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag1, school.prepareMyBag());
    }

    @Test
    void addPencils() {
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag2, school.addPencils());
    }
}