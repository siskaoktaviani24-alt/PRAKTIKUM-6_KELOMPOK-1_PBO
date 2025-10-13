package aggregation;

import java.util.List;

public class Penjualan {
    String idPenjualan;
    String tanggal;
    Kasir kasir;
    List<ProdukMakeup> daftarProduk;

    Penjualan(String idPenjualan, String tanggal, Kasir kasir, List<ProdukMakeup> daftarProduk) {
        this.idPenjualan = idPenjualan;
        this.tanggal = tanggal;
        this.kasir = kasir;
        this.daftarProduk = daftarProduk;
    }

    void tampilkanInfo() {
        int totalHarga = 0;
        StringBuilder daftar = new StringBuilder();

        for (int i = 0; i < daftarProduk.size(); i++) {
            ProdukMakeup p = daftarProduk.get(i);
            daftar.append(p.getNamaProduk());
            totalHarga += p.getHarga();
            if (i < daftarProduk.size() - 1) daftar.append(", ");
        }

        System.out.println("Pada tanggal " + tanggal +
                ", kasir " + kasir.getNamaKasir() +
                " berhasil menjual produk: " + daftar +
                " dengan total harga Rp" + totalHarga +
                " (ID Penjualan: " + idPenjualan + ").");
    }
}