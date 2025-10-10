// ProdukMakeup.java
package composition;

public class ProdukMakeup {
    private String namaProduk;
    private double harga;

    public ProdukMakeup(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }
}
