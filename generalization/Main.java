// Main.java
package generalization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat berbagai jenis produk make up
        Lipstick lipstick = new Lipstick("Maybelline Matte", 75000, "Merah Muda");
        Foundation foundation = new Foundation("Wardah Liquid", 120000, "Normal");
        Maskara maskara = new Maskara("L'Oreal Lash", 95000, true);

        // Tambahkan ke daftar produk (semua dianggap sebagai ProdukMakeup)
        List<ProdukMakeup> daftarProduk = new ArrayList<>();
        daftarProduk.add(lipstick);
        daftarProduk.add(foundation);
        daftarProduk.add(maskara);

        // Buat transaksi penjualan
        Penjualan penjualan1 = new Penjualan("PJ001", daftarProduk);

        // Tampilkan hasil penjualan dalam bentuk kalimat
        penjualan1.tampilkanKalimatPenjualan();
    }
}