// Main.java
package composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa produk makeup
        ProdukMakeup p1 = new ProdukMakeup("Lipstick", 75000);
        ProdukMakeup p2 = new ProdukMakeup("Foundation", 120000);
        ProdukMakeup p3 = new ProdukMakeup("Maskara", 90000);

        // Menambahkan ke daftar produk
        List<ProdukMakeup> daftarProduk = new ArrayList<>();
        daftarProduk.add(p1);
        daftarProduk.add(p2);
        daftarProduk.add(p3);

        // Membuat objek Penjualan
        Penjualan penjualan1 = new Penjualan("P001", daftarProduk);

        // Menampilkan kalimat hasil penjualan
        penjualan1.tampilkanKalimatPenjualan();
    }
}