package association.bidirectional;

import java.util.ArrayList;

public class Produk {
    String nama;
    double harga;
    ArrayList<LaporanPenjualan> daftarLaporan = new ArrayList<>();

    Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tambahLaporan(LaporanPenjualan laporan) {
        daftarLaporan.add(laporan);
    }

    void menampilkanLaporan(int index) {
        System.out.println("Produk " + daftarLaporan.get(index).produk.nama + 
                           " terjual sebanyak " + daftarLaporan.get(index).jumlah + " pcs.");
    }
}
