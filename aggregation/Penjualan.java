import java.util.List;

public class Penjualan {
    private String idPenjualan;
    private String tanggalPenjualan; // 🆕 Tambahan tanggal penjualan
    private Kasir kasir; // Aggregation: Penjualan memiliki Kasir
    private List<ProdukMakeup> daftarProduk; // Aggregation: Penjualan memiliki daftar produk

    // 🆕 Konstruktor ditambah parameter tanggalPenjualan
    public Penjualan(String namaProduk, String idPenjualan, String tanggalPenjualan, Kasir kasir, List<ProdukMakeup> daftarProduk) {
        this.idPenjualan = idPenjualan;
        this.tanggalPenjualan = tanggalPenjualan;
        this.kasir = kasir;
        this.daftarProduk = daftarProduk;
    }

    public void tampilkanDetailPenjualan() {
        System.out.println("=== DETAIL PENJUALAN ===");
        System.out.println("ID Penjualan    : " + idPenjualan);
        System.out.println("Tanggal         : " + tanggalPenjualan); // 🆕 Tampilkan tanggal
        kasir.tampilkanInfo();
        System.out.println("Daftar Produk Terjual:");
        
        int nomor = 1;
        for (ProdukMakeup produk : daftarProduk) {
            System.out.print(nomor + ". ");
            produk.tampilkanInfo();
            nomor++;
        }
    }

    public void terjual(ProdukMakeup produk) {
        System.out.println(produk.getNamaProduk() + " habis terjual.");
    }
}