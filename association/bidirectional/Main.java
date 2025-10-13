package association.bidirectional;

public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Lipstick", 75000);
        LaporanPenjualan laporan1 = new LaporanPenjualan("10 Okt 2025", 10, produk1);

        produk1.menampilkanLaporan(0);
        laporan1.tampilLaporan();
    }
}

