package generalization;

public class Foundation extends ProdukMakeup {
    String tipeKulit;

    public Foundation(String namaProduk, int harga, String tipeKulit) {
        super(namaProduk, harga);
        this.tipeKulit = tipeKulit;
    }

    protected String getDeskripsi() {
        return "Foundation " + namaProduk + " untuk kulit " + tipeKulit;
    }
}