package algorithms;

public class SelectionSort {
    private int[] arr = null;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = j;
                }
            }
            this.swap(arr, i, temp);
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
