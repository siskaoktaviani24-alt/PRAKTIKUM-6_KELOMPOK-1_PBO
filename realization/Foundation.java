// Foundation.java
package realization;

public class Foundation implements PenjualanInterface {
    private String nama;
    private double harga;
    private String tipeKulit;

    public Foundation(String nama, double harga, String tipeKulit) {
        this.nama = nama;
        this.harga = harga;
        this.tipeKulit = tipeKulit;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Foundation " + nama + " untuk kulit " + tipeKulit +
                           " seharga Rp" + String.format("%,.0f", harga));
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public String getDeskripsi() {
        return "Foundation " + nama + " untuk kulit " + tipeKulit;
    }
}
