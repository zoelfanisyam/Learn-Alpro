package strukturData;

public class selctionSort {
    int temp;
    int[] data = { 8, 9, 2, 4, 5 };

    void viewData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
    }

    void viewDatatoSmall() {
        for (int i = 0; i < data.length; i++) {
            temp = i;
            for (int j = (i + 1); j < data.length; j++) {
                if (data[j] < data[temp]) {
                    temp = j;
                }
            }
            if (temp != i) {
                int t = data[temp];
                data[temp] = data[i];
                data[i] = t;
                System.out.println("Iterasi Ke-" + (i + 1));
                viewData();
            }
        }
    }

    public static void main(String[] args) {
        selctionSort data = new selctionSort();
        data.viewData();
        data.viewDatatoSmall();
    }
}
