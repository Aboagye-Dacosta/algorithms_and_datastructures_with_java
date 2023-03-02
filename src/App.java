import java.util.Scanner;
import algorithms.MergeSort;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Merge Sort");
        MergeSort mergeSort = new MergeSort(getArray());
        print(mergeSort.sort());

    }

    // accept user input and return array
    public static int[] getArray() {
        System.out.println("Enter the size of the array: ");
        int size = 0;
        try (Scanner sc = new Scanner(System.in)) {
            size = sc.nextInt();
            // accept user input for size
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter the element: ");
                arr[i] = sc.nextInt();
            }

            return arr;
        }
    }

    public static void print(int arr[]) {

        String results = "";
        for (int i = 0; i < arr.length; i++) {
            results += arr[i] + " ";
        }

        System.out.println(results);
    }
}
