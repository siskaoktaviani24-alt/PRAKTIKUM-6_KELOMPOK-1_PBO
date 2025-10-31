package kosmetik_console;

public class Produk {
    private String kode;
    private String nama;
    private int stok;
    private double harga;

    public Produk(String kode, String nama, int stok, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getStok() { return stok; }
    public double getHarga() { return harga; }

    public void kurangiStok(int qty) { this.stok -= qty; }

    public void tampilkan() {
        System.out.println(kode + " | " + nama + " | Stok: " + stok + " | Rp" + harga);
    }
}
