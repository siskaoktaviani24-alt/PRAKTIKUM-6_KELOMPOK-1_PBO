package aggregation;

public class ProdukMakeup {
    public String namaProduk;
    int harga;

    public ProdukMakeup(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }
}