package generalization;

public class ProdukMakeup {
    String namaProduk;
    int harga;

    public ProdukMakeup(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    String getNamaProduk() {
        return namaProduk;
    }

    double getHarga() {
        return harga;
    }
}