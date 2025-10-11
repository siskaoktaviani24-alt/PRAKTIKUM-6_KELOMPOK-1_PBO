package association.bidirectional;

import java.util.ArrayList;

public class Produk {
    private String nama;
    private double harga;
    private ArrayList<LaporanPenjualan> daftarLaporan = new ArrayList<>();

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    public void tambahLaporan(LaporanPenjualan l) {
        daftarLaporan.add(l);
    }

    public void tampilInfo() {
        System.out.println("Produk: " + nama + " (Rp " + harga + ")");
    }
}

