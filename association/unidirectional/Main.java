package association.unidirectional;

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("Lipstick", 75000);
        LaporanPenjualan laporan1 = new LaporanPenjualan();
        LaporanPenjualan laporan2 = new LaporanPenjualan();

        laporan1.tampilLaporan(p1);
        laporan2.tampilLaporan(p1);
    }
}

