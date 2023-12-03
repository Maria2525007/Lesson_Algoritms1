import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int N = 10;
       Random rand = new Random();
       int[] arr1 = new int[N];
       int[] arr2 = new int[N];
       int[] arr3 = new int[N];

       for (int i = 0; i < N; i++) {
           arr1[i] = rand.nextInt(1000);
           arr2[i] = arr1[i];
           arr3[i] = arr1[i];

       }
        long startTime1 = System.nanoTime();
       Arrays.sort(arr1);
        long endTime1 = System.nanoTime();
        System.out.println("Quick sorting took: " + (endTime1 - startTime1) + " ns");

        long startTime2 = System.nanoTime();
        bubbleSort(arr2);
        long endTime2 = System.nanoTime();
        System.out.println("Buble sorting took: " + (endTime2 - startTime2) + " ns");

        long startTime3 = System.nanoTime();
        insertionSort(arr3);
        long endTime3 = System.nanoTime();
        System.out.println("Insertion sorting took: " + (endTime3 - startTime3) + " ns");

       bubbleSort(arr2);
       insertionSort(arr3);

    }
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}