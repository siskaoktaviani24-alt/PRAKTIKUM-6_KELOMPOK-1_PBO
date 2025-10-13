package association.bidirectional;

public class LaporanPenjualan {
    public String tanggal;  
    public int jumlah;      
    public Produk produk;   

    public LaporanPenjualan(String tanggal, int jumlah, Produk produk) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.produk = produk;
        produk.tambahLaporan(this); // hubungan dua arah
    }

    public void tampilLaporan() {
        System.out.println("Tanggal: " + tanggal + ", Jumlah: " + jumlah +  ", Produk: " + produk.getNama());
    }
}