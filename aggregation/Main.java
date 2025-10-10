import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // === Membuat produk makeup ===
        ProdukMakeup p1 = new ProdukMakeup("Lipstick", 75000);
        ProdukMakeup p2 = new ProdukMakeup("Foundation", 120000);
        ProdukMakeup p3 = new ProdukMakeup("Maskara", 90000);

        // === Membuat kasir ===
        Kasir kasir1 = new Kasir("Siska");

        // === Membuat daftar produk ===
        List<ProdukMakeup> daftarProduk = new ArrayList<>();
        daftarProduk.add(p1);
        daftarProduk.add(p2);
        daftarProduk.add(p3);

        // === Menambahkan tanggal penjualan otomatis (tanggal hari ini) ===
        String tanggal = LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // === Membuat penjualan (dengan tanggal) ===
        Penjualan penjualan1 = new Penjualan("", "P01", tanggal, kasir1, daftarProduk);

        // === Menampilkan detail penjualan ===
        penjualan1.tampilkanDetailPenjualan();

        // === Menampilkan total harga semua produk ===
        int totalHarga = 0;
        for (ProdukMakeup produk : daftarProduk) {
            totalHarga += produk.getHarga();
        }

        System.out.println("----------------------------");
        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println("============================");
    }
}
