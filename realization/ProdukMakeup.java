// ProdukMakeup.java
package realization;

public class ProdukMakeup implements PenjualanInterface {
    private String nama;
    private double harga;

    public ProdukMakeup(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Produk makeup umum: " + nama + " seharga Rp" + String.format("%,.0f", harga));
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public String getDeskripsi() {
        return "Produk makeup bernama " + nama;
    }
}
