package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Ekaterina MArinova
 */
public class BubbleSortTest {

    private static final String MESSAGE = "Array cannot be sorted because it " +
            "either contains only 1 or does not contain any elements.";

    private int[] arr;
    private int[] expected;
    private BubbleSort bubbleSort;

    @BeforeEach
    void init() {
        arr = new int[] {10,9,8,7,6,5,4,3,2,1};
        bubbleSort = new BubbleSort();
    }

    @Test
    void testSort() throws Exception {
        //arrange
        expected = new int[] {1,2,3,4,5,6,7,8,9,10};

        //act
        int[] actual = bubbleSort.sortAscending(arr);

        //assert
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSort_withInvalidArray() {
        //arrange
        arr = new int[] {};

        //act
        Exception e = Assertions.assertThrows(
                Exception.class,
                () -> {
                    bubbleSort.sortAscending(arr);
                }
        );

        //assert
        Assertions.assertEquals(MESSAGE, e.getMessage());
    }
}
