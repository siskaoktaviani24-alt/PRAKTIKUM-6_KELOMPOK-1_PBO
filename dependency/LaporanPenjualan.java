package dependency;

import java.util.ArrayList;

public class LaporanPenjualan {
    private String tanggal;
    private ArrayList<Produk> daftarProduk;

    public LaporanPenjualan(String tanggal) {
        this.tanggal = tanggal;
        this.daftarProduk = new ArrayList<>();
    }

    // menambahkan produk yang terjual
    public void tambahProdukTerjual(Produk produk) {
        daftarProduk.add(produk);
    }

    // menampilkan pesan sederhana seperti "nama produk telah terjual pada tanggal ..."
    public void tampilkanDetailPenjualan() {
        System.out.println("=== LAPORAN PENJUALAN ===");
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() + " telah terjual pada " + tanggal);
        }
    }
}