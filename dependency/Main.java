import aplikasiConsole.Produk;

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("Lip Tint", 45000);
        Produk p2 = new Produk("Bedak Padat", 60000);
        Produk p3 = new Produk("Maskara", 55000);

        LaporanPenjualan laporan = new LaporanPenjualan("14 Oktober 2025");

        laporan.tambahProdukTerjual(p1);
        laporan.tambahProdukTerjual(p2);
        laporan.tambahProdukTerjual(p3);

        laporan.tampilkanDetailPenjualan();
    }
}
