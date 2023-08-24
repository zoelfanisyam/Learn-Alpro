package Latihan;

import java.util.Scanner;

public class CariKata {
    String[] kamus = { "Apel", "Durian", "Mangga", "Salak", "Semangka" };
    int left = 0;
    int right = kamus.length - 1;
    int hasil = 0;
    int mid;

    void searchWord(String cari) {
        while (left <= right && hasil == 0) {
            mid = (left + right) / 2;

            int comparisson = cari.compareToIgnoreCase(kamus[mid]);

            if (comparisson == 0) {
                hasil = 1;
            } else if (comparisson > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (hasil == 1) {
            System.out.println("Data ditemukan yaitu : " + cari);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CariKata apel = new CariKata();
        System.out.print("Masukan Kata : ");
        String kata = input.nextLine();
        apel.searchWord(kata);

    }
}
