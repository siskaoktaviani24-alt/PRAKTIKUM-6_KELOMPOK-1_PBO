// Lipstick.java
package realization;

public class Lipstick extends ProdukMakeup {
    private String warna;

    public Lipstick(String namaProduk, double harga, String warna) {
        super(namaProduk, harga);
        this.warna = warna;
    }

    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk Lipstick
        return harga * 0.10;
    }

    @Override
    public void tampilkanKalimat() {
        double hargaAkhir = harga - hitungDiskon();
        System.out.println("Lipstick " + namaProduk + " warna " + warna + 
            " dijual dengan harga Rp" + harga + 
            ", mendapatkan diskon Rp" + hitungDiskon() +
            ", sehingga harga akhirnya menjadi Rp" + hargaAkhir + ".");
    }
}
