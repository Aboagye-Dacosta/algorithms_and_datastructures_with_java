package algorithms;

public class MergeSort {
    private int[] arr = null;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public int[] sort() {
        this.mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int middle = (end + start) / 2;
        this.mergeSort(arr, start, middle);
        this.mergeSort(arr, middle + 1, end);

        this.merge(arr, start, middle, end);
    }

    private int[] merge(int[] arr, int start, int middle, int end) {

        int num1 = (middle - start) + 1;
        int num2 = end - middle;

        int[] arrOne = new int[num1];
        int[] arrTwo = new int[num2];

        for (int i = 0; i < num1; i++) {
            arrOne[i] = arr[start + i];
        }

        for (int i = 0; i < num2; i++) {
            arrTwo[i] = arr[i + middle + 1];
        }

        int i, j, k;

        i = 0;
        j = 0;
        k = start;

        while (i < num1 && j < num2) {

            if (arrOne[i] <= arrTwo[j]) {
                arr[k] = arrOne[i];
                i++;
            } else {
                arr[k] = arrTwo[j];
                j++;
            }
            k++;

        }

        while (i < num1) {
            arr[k] = arrOne[i];
            k++;
            i++;
        }

        while (j < num2) {
            arr[k] = arrTwo[j];
            k++;
            j++;
        }

        return null;
    }
}
