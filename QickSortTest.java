import org.example.FileJson;
import org.example.QuickSort;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.NoSuchElementException;

import static org.example.QuickSort.quickSort;

public class QickSortTest {
    @Test
    public void NoSuchEementExceptionTest(){
        int[] arr = {};
        Assertions.assertThrows(NoSuchElementException.class, () -> quickSort(arr, 0, 6));
    }

    @Test
    public void ExceptionTest(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertThrows(Exception.class, () -> quickSort(arr, 7, 7));
    }

    @Test
    public void Test() throws Exception {
        int[] arr = {7, 3, 5, 9, 1, 2, 6};
        QuickSort.quickSort(arr, 0, 6);
    }

}
