// Foundation.java
package generalization;

public class Foundation extends ProdukMakeup {
    private String tipeKulit;

    public Foundation(String namaProduk, double harga, String tipeKulit) {
        super(namaProduk, harga);
        this.tipeKulit = tipeKulit;
    }

    public String getDeskripsi() {
        return "Foundation " + namaProduk + " untuk kulit " + tipeKulit;
    }
}