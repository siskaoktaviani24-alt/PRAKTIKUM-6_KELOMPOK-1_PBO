// Main.java
package multiplicity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat kasir
        Kasir kasir1 = new Kasir("Siska");

        // Membuat produk makeup
        ProdukMakeup p1 = new ProdukMakeup("Lipstick Wardah", 85000);
        ProdukMakeup p2 = new ProdukMakeup("Foundation Maybelline", 120000);
        ProdukMakeup p3 = new ProdukMakeup("Maskara Emina", 75000);

        // Penjualan 1: dua produk
        List<ProdukMakeup> daftarProduk1 = new ArrayList<>();
        daftarProduk1.add(p1);
        daftarProduk1.add(p2);

        // Penjualan 2: satu produk
        List<ProdukMakeup> daftarProduk2 = new ArrayList<>();
        daftarProduk2.add(p3);

        // Membuat dua transaksi
        Penjualan penjualan1 = new Penjualan("P001", "10 Oktober 2025", kasir1, daftarProduk1);
        Penjualan penjualan2 = new Penjualan("P002", "11 Oktober 2025", kasir1, daftarProduk2);

        // Output berbentuk kalimat
        penjualan1.tampilkanKalimat();
        penjualan2.tampilkanKalimat();
    }
}
