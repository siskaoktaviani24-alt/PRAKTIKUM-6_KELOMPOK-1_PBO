package aggregation;

public class ProdukMakeup {
    String namaProduk;
    int harga;

    ProdukMakeup(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    String getNamaProduk() {
        return namaProduk;
    }

    int getHarga() {
        return harga;
    }
}