package algorithms;

public class BubbleSort {
    private int[] arr = null;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    private void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    // implement bubble sort
    public int[] sort() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr.length - (i + 1); j++) {
                if (this.arr[j] < this.arr[j + 1]) {
                    this.swap(this.arr, j);
                }
            }
        }

        return this.arr;
    }

}