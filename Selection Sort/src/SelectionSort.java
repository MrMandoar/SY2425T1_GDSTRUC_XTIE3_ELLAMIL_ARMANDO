import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //Da Numbahs
        int[] numbers = {69, 420, 177013, 21, 80085, 8008135};

        // The "Method" (W rizz)
        selectionSortSmallestToEnd(numbers);

        // Da Final message pag goods na
        System.out.println("Final sorted array (Selection Sort Smallest to End): " + Arrays.toString(numbers));
        System.out.println("You did so good king ~");
    }

    // Da Main Event
    public static void selectionSortSmallestToEnd(int[] arr) {
        int n = arr.length;

        // start from da end brutha
        for (int i = n - 1; i > 0; i--) {
            int minIndex = i;

            // Get da smol one
            for (int j = 0; j <= i; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap that thang
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

                // Show this with every switch
                System.out.println("Array after swapping " + arr[minIndex] + " and " + arr[i] + ": " + Arrays.toString(arr));
            }
        }
    }
}
