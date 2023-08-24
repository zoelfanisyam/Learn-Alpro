package strukturData;

/**
 * insertionSort
 */
public class insertionSort {
    int temp;
    int[] arr = { 8, 7, 3, 9, 10 };

    void viewArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void viewArrtoSmall() {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        viewArr();
    }

    public static void main(String[] args) {
        insertionSort arrData = new insertionSort();
        arrData.viewArr();
        arrData.viewArrtoSmall();
    }
}