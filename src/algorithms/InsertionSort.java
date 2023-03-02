package algorithms;

public class InsertionSort {
    private int[] arr = null;

    public InsertionSort(int[] arr) {
        this.arr = arr;

    }

    public int[] sort() {
        for (int i = 1; i < this.arr.length; i++) {
            int key = arr[i];
            int step = i - 1;

            while (step >= 0 && key < arr[step]) {
                arr[step + 1] = arr[step];
                --step;
            }

            arr[step + 1] = key;
        }
        return arr;
    }

    // private void swap(int[] arr, int i, int j) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
}
