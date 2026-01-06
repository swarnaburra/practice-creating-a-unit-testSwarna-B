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

   }

