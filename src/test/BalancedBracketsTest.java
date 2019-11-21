package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    BalancedBrackets test_Class;

    @Before
    public void createObject() {
        test_Class = new BalancedBrackets();
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void non_bracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("launchcode"));
    }

    @Test
    public void testValues() {
        assertEquals("Expected value must match actual", test_Class.hasBalancedBrackets("[test code]"), true);
        assertNotSame("condition fails if string doesn't have balanced brackets", test_Class.hasBalancedBrackets("[test,code"), true);
    }

    @Test
    public void reversedBalancedBracketsBetweenString() {

        assertTrue(test_Class.hasBalancedBrackets("]LaunchCode["));
        //System.out.println(test_Class.hasBalancedBrackets("]["));

    }

    @Test
    public void reversedBalancedBrackets() {

        assertTrue(test_Class.hasBalancedBrackets("]["));
    }

    @Test
    public void stringBetweenBalancedBrackets(){
        assertTrue(test_Class.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void stringWithBalancedBrackets(){
        assertTrue(test_Class.hasBalancedBrackets("[]Launchcode"));
    }
    //expected false
    @Test
    public void onlyleftOpenUnBalancedBracket(){
        assertFalse(test_Class.hasBalancedBrackets("["));
    }
    @Test
    public void onlyRightOpenUnBalancedBracket(){
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

}