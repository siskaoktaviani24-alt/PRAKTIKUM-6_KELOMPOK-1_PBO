package generalization;

import java.util.List;

public class Penjualan {
    String idPenjualan;
    List<ProdukMakeup> daftarProduk;

    Penjualan(String idPenjualan, List<ProdukMakeup> daftarProduk) {
        this.idPenjualan = idPenjualan;
        this.daftarProduk = daftarProduk;
    }

    void tampilkanPenjualan() {
        int total = 0;
        StringBuilder daftar = new StringBuilder();

        for (int i = 0; i < daftarProduk.size(); i++) {
            ProdukMakeup p = daftarProduk.get(i);
            daftar.append(p.getNamaProduk());
            total += p.getHarga();
            if (i < daftarProduk.size() - 1) daftar.append(", ");
        }

        System.out.println("Penjualan dengan ID " + idPenjualan +
                " berhasil dilakukan. Produk yang terjual: " + daftar +
                " dengan total harga Rp" + total);
    }
}