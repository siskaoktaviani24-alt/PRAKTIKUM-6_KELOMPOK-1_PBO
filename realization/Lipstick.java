// Lipstick.java
package realization;

public class Lipstick implements PenjualanInterface {
    private String nama;
    private double harga;
    private String warna;

    public Lipstick(String nama, double harga, String warna) {
        this.nama = nama;
        this.harga = harga;
        this.warna = warna;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Lipstick " + nama + " (" + warna + ") seharga Rp" + String.format("%,.0f", harga));
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public String getDeskripsi() {
        return "Lipstick " + nama + " warna " + warna;
    }
}
