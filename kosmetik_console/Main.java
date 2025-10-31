package kosmetik_console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KasirApp app = new KasirApp();
        app.initData();

        System.out.println("======================================");
        System.out.println("     SISTEM KASIR TOKO KOSMETIK       ");
        System.out.println("======================================");

        boolean login = false;
        while (!login) {
            System.out.print(" Username : ");
            String u = sc.nextLine();
            System.out.print(" Password : ");
            String p = sc.nextLine();

            if (app.login(u, p)) {
                login = true;
                System.out.println("--------------------------------------");
                System.out.println(" Login berhasil! Selamat datang !! ");
                System.out.println("--------------------------------------");
            } else {
                System.out.println("\n⚠  Username atau password salah! Coba lagi.\n");
            }
        }

        while (true) {
            System.out.println("\n======================================");
            System.out.println("              MENU UTAMA              ");
            System.out.println("======================================");
            System.out.println(" 1. Lihat Produk");
            System.out.println(" 2. Tambah Produk");
            System.out.println(" 3. Transaksi Penjualan");
            System.out.println(" 4. Keluar");
            System.out.println("======================================");
            System.out.print(" Pilih menu (1-4) : ");

            int pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1 -> app.tampilProduk();
                case 2 -> app.tambahProduk(sc);
                case 3 -> app.transaksi(sc);
                case 4 -> {
                    System.out.println("\nTerima kasih telah menggunakan sistem ");
                    return;
                }
                default -> System.out.println("\n⚠ Pilihan tidak valid!");
            }
        }
    }
}
