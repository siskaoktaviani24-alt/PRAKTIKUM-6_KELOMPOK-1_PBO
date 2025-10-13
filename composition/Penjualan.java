// Penjualan.java
package composition;

public class Penjualan {
    // Atribut
    private ProdukMakeup produk1;
    private ProdukMakeup produk2;

    // Konstruktor
    public Penjualan(String nama1, double harga1, String nama2, double harga2) {
        // Composition: Produk dibuat di dalam Penjualan
        produk1 = new ProdukMakeup(nama1, harga1);
        produk2 = new ProdukMakeup(nama2, harga2);
    }

    // Method menghitung total harga
    public double hitungTotal() {
        return produk1.getHarga() + produk2.getHarga();
    }

    // Method membuat narasi penjualan
    public String getNarasiPenjualan() {
        return "Kasir mencatat penjualan dua produk, yaitu " +
               produk1.getDeskripsiProduk() + " dan " +
               produk2.getDeskripsiProduk() +
               ". Total penjualan hari ini mencapai Rp" +
               String.format("%,.0f", hitungTotal()) + ".";
    }
}
