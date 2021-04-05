public class Main {

    public static void main(String[] args) {

        int[][] arrays = {
                {100, 79, 45, 21, -9},
                {-9, 100, 79, 45, 21},
                {21, -9, 100, 79, 45},
                {45, 21, -9, 100, 79},
                {79, 45, 21, -9, 100},
                {0, -5, -1, 0, -5},
                {-5, 0, -5, -1, 0},
                {0, -5, 0, -5, -1},
                {-1, 0, -5, 0, -5},
                {-5, -1, 0, -5, 0},
                {1, 1, 1, 1, 0}
        };

        for (int[] array: arrays) {
            System.out.print("before: " + java.util.Arrays.toString(array));
            Sort5in7.sort(array);
            System.out.print(" after: " + java.util.Arrays.toString(array) + "\n");
        }
    }
}
