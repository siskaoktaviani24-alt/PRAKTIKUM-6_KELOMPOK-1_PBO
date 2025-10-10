// Penjualan.java
package multiplicity;

import java.util.List;

public class Penjualan {
    private String tanggal;
    private Kasir kasir;
    private List<ProdukMakeup> daftarProduk;

    public Penjualan(String idPenjualan, String tanggal, Kasir kasir, List<ProdukMakeup> daftarProduk) {
        this.tanggal = tanggal;
        this.kasir = kasir;
        this.daftarProduk = daftarProduk;
    }

    public void tampilkanKalimat() {
        double total = 0;
        StringBuilder daftar = new StringBuilder();

        for (int i = 0; i < daftarProduk.size(); i++) {
            ProdukMakeup p = daftarProduk.get(i);
            daftar.append(p.getNamaProduk());
            total += p.getHarga();

            if (i < daftarProduk.size() - 1) {
                daftar.append(", ");
            }
        }

        System.out.println("Pada tanggal " + tanggal + ", kasir " + kasir.getNamaKasir() +
                " berhasil menjual produk " + daftar.toString() +
                " dengan total penjualan sebesar Rp" + total + ".");
    }
}