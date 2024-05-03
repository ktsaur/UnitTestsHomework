package org.example;

import java.util.NoSuchElementException;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) throws Exception {
        if (array.length == 0)
            throw new NoSuchElementException("Длина массива 0");
        if (low >= high)
            throw new Exception("Массив уже отсортирован");
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
