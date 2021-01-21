package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    BonusBinarySearch search;

    @Before
    public void createObject(){
        search = new BonusBinarySearch();
    }
    @Test
    public void emptyTest(){
            assertEquals(true,true);
    }
    @Test
    public void testWithValues(){
        assertEquals(1, BonusBinarySearch.binarySearch(new int[]{2, 3, 10, 50},3));
    }

    @Test
    public void testwithemptyValues(){
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[]{},0));
    }
    @Test
    public void testWithLessIntegers(){
        assertEquals(1, BonusBinarySearch.binarySearch(new int[]{3,4,89},4));
    }
    @Test
    public void testUnsortedOrder(){
        assertEquals(0, BonusBinarySearch.binarySearch(new int[]{50,2,4,6,10},50));
    }
    @Test
    public void testOnlyOneInteger(){
        assertEquals(0, BonusBinarySearch.binarySearch(new int[]{5},5));

    }
    @Test
    public void testWithInvalidNumber(){
        assertNotEquals(1,search.binarySearch(new int[]{4, 89, 78}, 2));
    }
}
