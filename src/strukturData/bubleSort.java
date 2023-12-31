package strukturData;

/**
 * bubleSort
 */
public class bubleSort {
    int[] number = { 7, 9, 3, 5, 4 };
    String[] kamus = { "Mangga", "Sirsak", "Apel", "Semangka", "Melon" };

    void viewNumber() {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    void viewNumberBigtoSmall() {
        for (int i = 1; i < number.length; i++) {
            if (number[i - 1] < number[i]) {
                int temp = number[i - 1];
                number[i - 1] = number[i];
                number[i] = temp;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

    }

    void viewWordBigtoSmall() {
        for (int i = 0; i < kamus.length; i++) {
            if (kamus[i].compareTo(kamus[i + 1]) > 0) {
                String temp = kamus[i];
                kamus[i] = kamus[i + 1];
                kamus[i + 1] = temp;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

    }

    void viewNumberSmalltoBig() {
        for (int j = 0; j < number.length; j++) {
            for (int i = 1; i < number.length; i++) {
                if (number[i - 1] > number[i]) {
                    int temp = number[i - 1];
                    number[i - 1] = number[i];
                    number[i] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }

    public static void main(String[] args) {
        bubleSort number1 = new bubleSort();

        number1.viewNumber();
        number1.viewNumberBigtoSmall();
        number1.viewNumberSmalltoBig();
        number1.viewWordBigtoSmall();
    }
}