package fibonachi;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3, 7, 8, 9, 1);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedList, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDuplicatesWithNull() {
        RemoveDuplicates.removeDuplicates(null);
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> emptyList = Collections.emptyList();

        List<Integer> result = RemoveDuplicates.removeDuplicates(emptyList);

        assertEquals(emptyList, result);
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedList, result);
    }

    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        List<Integer> singleElementList = Collections.singletonList(42);

        List<Integer> result = RemoveDuplicates.removeDuplicates(singleElementList);

        assertEquals(singleElementList, result);
    }

    @Test
    public void testRemoveDuplicatesWithNonIntegerElements() {
        List<Integer> mixedList = Arrays.asList(1, 2, 3, 2, 4, 5, 5);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = RemoveDuplicates.removeDuplicates(mixedList);

        assertEquals(expectedList, result);
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        List<Integer> allDuplicatesList = Arrays.asList(1, 1, 1, 1, 1, 1, 1);
        List<Integer> expectedList = Collections.singletonList(1);

        List<Integer> result = RemoveDuplicates.removeDuplicates(allDuplicatesList);

        assertEquals(expectedList, result);
    }
}
