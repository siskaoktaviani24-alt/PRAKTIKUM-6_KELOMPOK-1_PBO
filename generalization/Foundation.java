package generalization;

public class Foundation extends ProdukMakeup {
    public String tipeKulit;

    public Foundation(String namaProduk, int harga, String tipeKulit) {
        super(namaProduk, harga);
        this.tipeKulit = tipeKulit;
    }

    public String getDeskripsi() {
        return "Foundation merek " + namaProduk + " cocok untuk kulit " +
               tipeKulit + " dengan harga Rp" + harga + ".";
    }
}