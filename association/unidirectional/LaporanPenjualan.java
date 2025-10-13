package association.unidirectional;

public class LaporanPenjualan {
    String tanggal;  
    int jumlah;      
    Produk produk;   

    public LaporanPenjualan(String tanggal, int jumlah, Produk produk) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.produk = produk;
    }

    public void tampilLaporan() {
        System.out.println("Tanggal: " + tanggal + ", Jumlah: " + jumlah + ", Produk: " + produk.getNama());
    }
}