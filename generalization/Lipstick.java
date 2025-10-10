// Lipstick.java
package generalization;

public class Lipstick extends ProdukMakeup {
    private String warna;

    public Lipstick(String namaProduk, double harga, String warna) {
        super(namaProduk, harga);
        this.warna = warna;
    }

    public String getDeskripsi() {
        return "Lipstick " + namaProduk + " berwarna " + warna;
    }
}