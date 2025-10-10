// ProdukMakeup.java
package realization;

public abstract class ProdukMakeup implements PenjualanInterface {
    protected String namaProduk;
    protected double harga;

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
