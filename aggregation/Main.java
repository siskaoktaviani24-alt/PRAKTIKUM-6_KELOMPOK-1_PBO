package aggregation;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ProdukMakeup p1 = new ProdukMakeup("Lipstick", 75000);
        ProdukMakeup p2 = new ProdukMakeup("Foundation", 120000);
        ProdukMakeup p3 = new ProdukMakeup("Maskara", 90000);

        Kasir kasir1 = new Kasir("Siska");

        List<ProdukMakeup> daftarProduk = new ArrayList<>();
        daftarProduk.add(p1);
        daftarProduk.add(p2);
        daftarProduk.add(p3);

        String tanggal = LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        Penjualan penjualan1 = new Penjualan("P001", tanggal, kasir1, daftarProduk);

        penjualan1.tampilkanPenjualan();
    }
}