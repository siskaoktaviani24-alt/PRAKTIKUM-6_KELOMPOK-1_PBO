package generalization;

public class Maskara extends ProdukMakeup {
    public boolean waterproof;

    public Maskara(String namaProduk, int harga, boolean waterproof) {
        super(namaProduk, harga);
        this.waterproof = waterproof;
    }

    public String getDeskripsi() {
        String jenis = waterproof ? "waterproof" : "non-waterproof";
        return "Maskara merek " + namaProduk + " bersifat " + jenis +
               " dengan harga Rp" + harga + ".";
    }
}