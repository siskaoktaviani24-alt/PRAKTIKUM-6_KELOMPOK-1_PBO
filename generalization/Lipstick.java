package generalization;

public class Lipstick extends ProdukMakeup {
    String warna;

    Lipstick(String namaProduk, int harga, String warna) {
        super(namaProduk, harga);
        this.warna = warna;
    }

    String getDeskripsi() {
        return "Lipstick " + namaProduk + " berwarna " + warna;
    }
}