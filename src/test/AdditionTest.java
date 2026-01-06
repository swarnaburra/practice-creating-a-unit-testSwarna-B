//The test class mirrors the name of the class being tested (with Test at the
//        end)
//The test method name clearly describes what is being tested
//The test can run independently and doesn’t rely on other tests
//There is at least one test for the normal (“happy path”) case
//There is at least one test for an edge case or unusual input
//The test uses appropriate assertions to verify behavior

package test;

import main.java.Addition;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class AdditionTest {
//Happy Path Test by adding two positive numbers
    @Test
    public void testAddTwoPositiveNumbers() {
        Addition addition = new Addition();
        assertEquals(5, addition.add(2, 3));
    }
// Adding edge case by adding zero to a positive number
    @Test
    public void testAddZeroToANumber(){
        Addition addition = new Addition();
        assertEquals(5, addition.add(0,5));
    }

    @Test
    public void testAddNegativeNumbers(){
        Addition addition = new Addition();
        assertEquals(-9, addition.add(-3,-6));
    }

   }

