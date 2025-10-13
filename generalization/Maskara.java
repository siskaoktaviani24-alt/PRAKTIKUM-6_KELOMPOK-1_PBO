package generalization;

public class Maskara extends ProdukMakeup {
    boolean waterproof;

    Maskara(String namaProduk, int harga, boolean waterproof) {
        super(namaProduk, harga);
        this.waterproof = waterproof;
    }

    String getDeskripsi() {
        String jenis = waterproof ? "waterproof" : "non-waterproof";
        return "Maskara " + namaProduk + " bersifat " + jenis;
    }
}