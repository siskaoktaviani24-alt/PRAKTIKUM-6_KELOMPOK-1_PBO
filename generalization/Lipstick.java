package generalization;

public class Lipstick extends ProdukMakeup {
    public String warna;

    public Lipstick(String namaProduk, int harga, String warna) {
        super(namaProduk, harga);
        this.warna = warna;
    }

    public String getDeskripsi() {
        return "Lipstick merek " + namaProduk + " berwarna " + warna +
               " dengan harga Rp" + harga + ".";
    }
}