// Main.java
package realization;

public class Main {
    public static void main(String[] args) {
        PenjualanInterface produk1 = new Lipstick("Wardah", 95000, "Merah Muda");
        PenjualanInterface produk2 = new Foundation("Maybelline", 120000, "Kering");
        PenjualanInterface produk3 = new ProdukMakeup("Bedak Tabur", 85000);

        System.out.println("===== LAPORAN PENJUALAN =====\n");
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
        produk3.tampilkanInfo();

        double total = produk1.getHarga() + produk2.getHarga() + produk3.getHarga();
        System.out.println("\nTotal Penjualan Hari Ini: Rp" + String.format("%,.0f", total));

        System.out.println("\nDeskripsi Produk:");
        System.out.println("- " + produk1.getDeskripsi());
        System.out.println("- " + produk2.getDeskripsi());
        System.out.println("- " + produk3.getDeskripsi());
    }
}
