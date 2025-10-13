// StrukPenjualan.java
package composition;
public class Kasir {
    // Atribut
    private String namaKasir;
    private Penjualan penjualan;

    // Konstruktor
    public Kasir(String namaKasir, String n1, double h1, String n2, double h2) {
        this.namaKasir = namaKasir;
        this.penjualan = new Penjualan(n1, h1, n2, h2);
    }

    // Method menampilkan laporan naratif
    public void tampilkanLaporan() {
        System.out.println("===== LAPORAN PENJUALAN =====");
        System.out.println("Kasir: " + namaKasir + "\n");
        System.out.println("Kasir " + namaKasir + " sedang bertugas di toko kosmetik hari ini.");
        System.out.println(penjualan.getNarasiPenjualan());
        System.out.println("Transaksi selesai. Terima kasih telah berbelanja!");
    }
}
