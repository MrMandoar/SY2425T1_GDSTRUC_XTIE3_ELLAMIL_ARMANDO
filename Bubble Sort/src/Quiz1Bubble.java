import java.util.Arrays;

public class Quiz1Bubble {
    public static void main(String[] args) {
        int[] numbers = {69, 420, 177013, 21, 80085, 8008135};

        // Sort using bubble and in descending ordah
        bubbleSortDescending(numbers);

        // Da final thing to show kung ok na lahat
        System.out.println("Final sorted array (Bubble Sort in Descending Order): " + Arrays.toString(numbers));
        System.out.println("Galing mo talaga pookie XOXO");
    }


    // Da bubble sort
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                    // Print it out after each swap
                    System.out.println("Array after swapping " + arr[j + 1] + " and " + arr[j] + ": " + Arrays.toString(arr));
                }
            }

            // If all is good, nothing is swapped, edi ok na sya :p
            if (!swapped) {
                break;
            }
        }
    }
}
