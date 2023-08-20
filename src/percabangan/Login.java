package percabangan;

import java.util.Scanner;

public class Login {
    Scanner input = new Scanner(System.in);
    String username;
    String password;
    public static String inputUsername;
    public static String inputPassword;
    Menu menu;

    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void checkingData(Menu menu) {
        if (inputUsername.equals(username)) {
            if (password.equals(password)) {
                System.out.println("Login Berhasil");
                System.out.println("Daftar Menu :");
                menu.daftarMenu();
                int memilihMenu = input.nextInt();
                menu.pilihanMenu(memilihMenu);
            }
        } else {
            System.out.println("Login Gagal");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login username1 = new Login("Hisyam", "12Mei2002");
        Menu menu = new Menu();

        System.out.print("Username :");
        inputUsername = input.nextLine();
        System.out.print("Password :");
        inputPassword = input.nextLine();
        username1.checkingData(menu);
    }
}
