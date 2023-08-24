package strukturData;

public class binarySearch {
    int[] numberUrut = { 1, 2, 3, 4, 5, 6, 7 };
    int cari = 6;
    int left = 0;
    int right = numberUrut.length - 1;
    int flag = 0;
    int mid;

    void viewNumberUrut() {
        for (int i = 0; i < numberUrut.length; i++) {
            System.out.print(numberUrut[i] + " ");
        }
        System.out.println();
    }

    void searchNumber() {
        while (left <= right && flag == 0) {
            mid = (left + right) / 2;
            if (cari == numberUrut[mid]) {
                flag = 1;
            } else if (cari < numberUrut[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println(cari);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        binarySearch number6 = new binarySearch();
        number6.viewNumberUrut();
        number6.searchNumber();
    }
}
