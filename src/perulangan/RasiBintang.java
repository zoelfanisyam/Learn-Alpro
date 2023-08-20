package perulangan;

/**
 * RasiBintang
 */
public class RasiBintang {

    void segitigaFor(int jumlahBintang) {
        for (int i = 1; i <= jumlahBintang; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void segitigaDo(int jumlahBintang) {
        int x = 1;
        int j = 1;
        do {
            while (x <= jumlahBintang) {
                while (j <= x) {
                    System.out.print(x);
                    j++;
                }
                x++;
                System.out.println();
            }
        } while (x <= jumlahBintang);
    }

    public static void main(String[] args) {
        RasiBintang segitigaForBintang = new RasiBintang();
        segitigaForBintang.segitigaFor(5);
        segitigaForBintang.segitigaDo(5);
    }
}