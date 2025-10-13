package association.bidirectional;

public class LaporanPenjualan {
    String tanggal;
    int jumlah;
    Produk produk;

    LaporanPenjualan(String tanggal, int jumlah, Produk produk) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.produk = produk;
        produk.tambahLaporan(this); // relasi dua arah
    }

    void tampilLaporan() {
        System.out.println("Laporan penjualan produk " + produk.nama +
                           " pada " + tanggal + " sebanyak " + jumlah + " pcs.");
    }
}
