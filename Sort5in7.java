public class Sort5in7 {

    public static void sort(int[] arr) {

        if (arr.length != 5) {
            throw new RuntimeException("The array doesn't contain 5 numbers.");
        }

        // 1. Sort the first two pairs (2 comparisons)
        if (arr[1] < arr[0]) {
            swap(arr, 1, 0);
        }
        if (arr[3] < arr[2]) {
            swap(arr, 3, 2);
        }

        // 2. Order the pairs with respect to their larger element (1 comparison)
        if (arr[3] < arr[1]) {
            swap(arr, 3, 1);
            swap(arr, 2, 0);
        }

        // Let's call the result {a, b, c, d, e}, knowing that a < b < d and c < d

        // 3. Put e into (a, b, d) (2 comparisons)
        if (arr[4] < arr[1]) {
            if (arr[4] < arr[0]) {
                swapNTimesFromRight(arr, 4,  4);
            } else {
                swapNTimesFromRight(arr, 4, 3);
            }

            // 4. Put c into the right position, knowing that c < d (2 comparisons)
            // c = arr[3] in this case
            if (arr[3] < arr[1]) {
                if (arr[3] < arr[0]) {
                    swapNTimesFromRight(arr, 3, 3);
                } else {
                    swapNTimesFromRight(arr, 3, 2);
                }
            } else {
                if (arr[3] < arr[2]) {
                    swap(arr, 3, 2);
                }
            }
        } else {
            if (arr[4] < arr[3]) {
                swap(arr, 4, 3);
            }

            // 4. Put c into the right position, knowing that c < d (2 comparisons)
            // c = arr[2] in this case
            if (arr[2] < arr[1]) {
                if (arr[2] < arr[0]) {
                    swapNTimesFromRight(arr, 2, 2);
                } else {
                    swap(arr, 2, 1);
                }
            } else {
                if (arr[2] > arr[3]) {
                    swap(arr, 3, 2);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapNTimesFromRight(int[] arr, int startIndex, int n) {
        // This method always start swapping from the right, making the element at 'startIndex' move left
        // (others move right)
        for (int i = startIndex; i > startIndex - n; i--) {
            swap(arr, i, i - 1);
        }
    }
}
