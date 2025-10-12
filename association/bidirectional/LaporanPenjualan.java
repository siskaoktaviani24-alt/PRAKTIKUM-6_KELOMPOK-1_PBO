package association.bidirectional;

public class LaporanPenjualan {
    String tanggal;  // Diubah dari private ke protected
    int jumlah;      // Diubah dari private ke protected
    Produk produk;   // Diubah dari private ke protected

    public LaporanPenjualan(String tanggal, int jumlah, Produk produk) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.produk = produk;
        produk.tambahLaporan(this); // hubungan dua arah
    }

    public void tampilLaporan() {
        System.out.println("Tanggal: " + tanggal + 
            ", Jumlah: " + jumlah + 
            ", Produk: " + produk.getNama());
    }
}