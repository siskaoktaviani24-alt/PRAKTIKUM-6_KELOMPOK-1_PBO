// Foundation.java
package realization;

public class Foundation extends ProdukMakeup {
    private String tipeKulit;

    public Foundation(String namaProduk, double harga, String tipeKulit) {
        super(namaProduk, harga);
        this.tipeKulit = tipeKulit;
    }

    @Override
    public double hitungDiskon() {
        // Diskon 15% untuk Foundation
        return harga * 0.15;
    }

    @Override
    public void tampilkanKalimat() {
        double hargaAkhir = harga - hitungDiskon();
        System.out.println("Foundation " + namaProduk + 
            " untuk kulit " + tipeKulit + 
            " dijual seharga Rp" + harga +
            ", mendapat diskon Rp" + hitungDiskon() +
            ", sehingga harga akhirnya Rp" + hargaAkhir + ".");
    }
}
