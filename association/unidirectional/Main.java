package association.unidirectional;

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("Lipstick", 75000);
        LaporanPenjualan l1 = new LaporanPenjualan("10 Okt 2025", 10, p1);

        l1.tampilLaporan();
    }
}

