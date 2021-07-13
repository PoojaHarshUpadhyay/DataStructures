import java.util.*;

public class Hello {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3, 8, 5, 9};
        Hello obj = new Hello();
        obj.mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            } else {
                arr[k] = R[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            arr[k] = L[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = R[j];
            k++;
            j++;
        }
    }
}
