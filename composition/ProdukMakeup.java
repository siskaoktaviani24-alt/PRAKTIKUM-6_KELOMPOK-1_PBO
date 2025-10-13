
package composition;

public class ProdukMakeup {
    // Atribut
    private String nama;
    private double harga;

    // Konstruktor
    public ProdukMakeup(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method
    public String getDeskripsiProduk() {
        return nama + " seharga Rp" + String.format("%,.0f", harga);
    }

    public double getHarga() {
        return harga;
    }
}
