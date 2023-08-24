package Latihan;

import java.util.Scanner;

public class CariKata {
    String[] kamus = { "Apel", "Durian", "Mangga", "Salak", "Semangka" };
    int left = 0;
    int right = kamus.length - 1;
    int hasil = 0;
    int mid;

    void searchWord(String cari) {
        // while (left <= right && hasil == 0) {
        // mid = (left + right) / 2;
        // if (cari.equals(kamus[mid])) {
        // hasil = 1;
        // } else {
        // right = mid - 1;
        // }
        // }
        // if (hasil == 1) {
        // System.out.println("Data ditemukan yaitu : " + cari);
        // } else {
        // System.out.println("Data tidak ditemukan");
        // }
        for (int i = 0; i < kamus.length; i++) {
            if (cari.equalsIgnoreCase(kamus[i])) {
                System.out.println("Kata ditemukan yaitu : " + cari);
            } else {
                System.out.println("Kata tidak ditemukan");
            }
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
