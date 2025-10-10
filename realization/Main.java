// Main.java
package realization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PenjualanInterface> daftarProduk = new ArrayList<>();

        Lipstick lipstick = new Lipstick("Maybelline Superstay", 100000, "Merah");
        Foundation foundation = new Foundation("Wardah Perfect Glow", 150000, "Normal");

        daftarProduk.add(lipstick);
        daftarProduk.add(foundation);

        System.out.println("=== TRANSAKSI PENJUALAN MAKEUP ===");
        for (PenjualanInterface produk : daftarProduk) {
            produk.tampilkanKalimat();
        }
    }
}