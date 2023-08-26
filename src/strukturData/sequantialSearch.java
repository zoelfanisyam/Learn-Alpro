package strukturData;

import java.util.Scanner;

public class sequantialSearch {
    String[] data = { "Jeruk", "Salak", "Durian", "Semangka", "Mangga", "Salak" };

    // View Search Data
    void viewSearch(String input) {
        for (int i = 0; i < data.length; i++) {
            int comparrison = input.compareToIgnoreCase(data[i]);
            if (comparrison == 0) {
                System.out.println("Data ditemukan : " + input);
                break;
            }
        }
    }

    // Menghitung banyak data yang ditemukan
    void hitungSearch(String input) {
        int x = 0;
        for (int i = 0; i < data.length; i++) {
            int comparrison = input.compareToIgnoreCase(data[i]);
            if (comparrison == 0) {
                x++;
            }
        }
        System.out.println("Jumlah data sebanyak : " + x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sequantialSearch data1 = new sequantialSearch();

        System.out.print("Masukan Data : ");
        String inputData = input.nextLine();

        data1.viewSearch(inputData);
    }
}
