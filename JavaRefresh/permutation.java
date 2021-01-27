package JavaRefresh;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class permutation {

    public static void PrintPermutation(int arr[], int index) {
        int size = arr.length;

        if (size == index + 1) {
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }else {
            for (int i = 0; i < size; i++) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                PrintPermutation(arr, index + 1);
            }
        }
    }
    public static void main(String [] args) {
        int a[] = {1, 2};
        int size = a.length;

        PrintPermutation(a, 0);
    }
}
