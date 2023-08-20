package runtutan;

import java.util.Scanner;

public class HitungLuas {
    int p;
    int l;

    int result;

    int rumusLuasPersegi(int p, int l) {
        this.p = p;
        this.l = l;
        result = p * l;
        System.out.println(result);
        return result;
    }

    int rumusLuasPersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
        result = 2 * (p + l);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HitungLuas persegi = new HitungLuas();
        HitungLuas persegiPanjang = new HitungLuas();
        System.out.println("Masukan panjang :");
        int p = input.nextInt();
        System.out.println("Masukan lebar :");
        int l = input.nextInt();

        persegi.rumusLuasPersegi(p, l);
        persegiPanjang.rumusLuasPersegiPanjang(p, l);
    }
}
