package association.unidirectional;

public class LaporanPenjualan {
    private String tanggal;
    private int jumlah;
    private Produk produk; // hanya mengenal Produk (satu arah)

    public LaporanPenjualan(String tanggal, int jumlah, Produk produk) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.produk = produk;
    }

    public void tampilLaporan() {
        System.out.println("Tanggal: " + tanggal + 
            ", Jumlah: " + jumlah + 
            ", Produk: " + produk.getNama());
    }
}

