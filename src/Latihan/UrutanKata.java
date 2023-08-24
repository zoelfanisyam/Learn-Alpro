package Latihan;

public class UrutanKata {
    String[] kamus = { "Mangga", "Sirsak", "Apel", "Semangka", "Melon" };
    int left = 0;
    int right = 0 - 1;
    int result = 0;

    void mengurut() {
        for (int i = 0; i < kamus.length - 1; i++) {
            for (int j = 0; j < kamus.length - i - 1; j++) {
                if (kamus[j].compareTo(kamus[j + 1]) > 0) {
                    String temp = kamus[j];
                    kamus[j] = kamus[j + 1];
                    kamus[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < kamus.length; i++) {
            System.out.print(kamus[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UrutanKata urutanKamus = new UrutanKata();
        urutanKamus.mengurut();
    }
}
