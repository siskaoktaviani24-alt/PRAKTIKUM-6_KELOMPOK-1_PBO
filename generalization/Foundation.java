package generalization;

public class Foundation extends ProdukMakeup {
    String tipeKulit;

    Foundation(String namaProduk, int harga, String tipeKulit) {
        super(namaProduk, harga);
        this.tipeKulit = tipeKulit;
    }

    String getDeskripsi() {
        return "Foundation " + namaProduk + " untuk kulit " + tipeKulit;
    }
}