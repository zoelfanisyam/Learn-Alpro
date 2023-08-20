package percabangan;

import java.lang.reflect.Array;

public class Menu {
    int pilihan;
    String[] menuMakanan = { "Nasi Goreng", "Mie Goreng", "Nasi Uduk", "Mie Tongseng", "Nasi Liwet", "Mie Kremes" };

    void daftarMenu() {
        System.out.println("1." + menuMakanan[0]);
        System.out.println("2." + menuMakanan[1]);
        System.out.println("3." + menuMakanan[2]);
        System.out.println("4." + menuMakanan[3]);
        System.out.println("5." + menuMakanan[4]);
        System.out.println("6." + menuMakanan[5]);
        System.out.print("Pilih Menu : ");
    }

    void pilihanMenu(int pilihan) {
        switch (pilihan) {
            case 1, 2, 5:
                System.out.println("Pesanan ada untuk menu " + menuMakanan[pilihan]);
                break;
            case 3, 4, 6:
                System.out.println("Pesanan tidak ada untuk menu " + menuMakanan[pilihan]);
                break;
            default:
                break;
        }
    }
}
