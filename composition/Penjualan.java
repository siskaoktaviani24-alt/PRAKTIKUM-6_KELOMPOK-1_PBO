// Penjualan.java
package composition;

import java.util.List;

public class Penjualan {
    private String idPenjualan;
    private List<ProdukMakeup> daftarProduk;
    private StrukPenjualan struk; // Composition: Penjualan memiliki StrukPenjualan

    public Penjualan(String idPenjualan, List<ProdukMakeup> daftarProduk) {
        this.idPenjualan = idPenjualan;
        this.daftarProduk = daftarProduk;
        this.struk = new StrukPenjualan("STRUK-" + idPenjualan);
    }

    public void tampilkanKalimatPenjualan() {
        double total = 0;
        StringBuilder produkList = new StringBuilder();

        for (int i = 0; i < daftarProduk.size(); i++) {
            ProdukMakeup p = daftarProduk.get(i);
            produkList.append(p.getNamaProduk());
            if (i < daftarProduk.size() - 1) produkList.append(", ");
            total += p.getHarga();
        }

        System.out.println("Penjualan dengan ID " + idPenjualan + 
            " telah berhasil pada tanggal " + struk.getTanggalCetak() +
            ". Produk yang dibeli: " + produkList +
            " dengan total harga Rp" + total + ".");
    }
}
