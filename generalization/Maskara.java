// Maskara.java
package generalization;

public class Maskara extends ProdukMakeup {
    private boolean waterproof;

    public Maskara(String namaProduk, double harga, boolean waterproof) {
        super(namaProduk, harga);
        this.waterproof = waterproof;
    }

    public String getDeskripsi() {
        String jenis = waterproof ? "waterproof" : "non-waterproof";
        return "Maskara " + namaProduk + " bersifat " + jenis;
    }
}