/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Bil481_App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test
    void testListNull(){
        ArrayList<Integer> array = null;
        assertFalse(App.isNumbersInArrayList(array, 1, 2));
    }

    @Test
    void testShortArray(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1));
        assertFalse(App.isNumbersInArrayList(array, 1, 2) | App.isNumbersInArrayList(array2, 1, 2));
    }

    @Test
    void testNumbersFound(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(9, 4, 1, 5, 2, 6));
        assertTrue(App.isNumbersInArrayList(array, 1, 2));
    }

    @Test
    void testNumbersNotFound(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(9, 4, 0, 5, 2, 12));
        assertFalse(App.isNumbersInArrayList(array, 1, 2));
    }
}
