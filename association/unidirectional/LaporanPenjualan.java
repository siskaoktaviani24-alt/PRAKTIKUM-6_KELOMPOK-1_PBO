package association.unidirectional;

public class LaporanPenjualan {
    Produk produk;   // asosiasi satu arah ke Produk

    void tampilLaporan(Produk produk) {
        System.out.println("Laporan penjualan produk: " + produk.nama + " dengan harga Rp " + produk.harga);
    }
}
