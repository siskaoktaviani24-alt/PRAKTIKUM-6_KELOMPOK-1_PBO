package kosmetik_console;

import java.util.ArrayList;
import java.util.Scanner;

public class KasirApp {
    private ArrayList<Admin> daftarAdmin = new ArrayList<>();
    private ArrayList<Produk> daftarProduk = new ArrayList<>();
    private Admin adminAktif;

    public void initData() {
        daftarAdmin.add(new Admin("A1", "Admin Utama", "admin", "123"));
        daftarProduk.add(new Produk("P001", "Lipstick Matte", 20, 55000));
        daftarProduk.add(new Produk("P002", "Serum Wajah Glow", 15, 120000));
        daftarProduk.add(new Produk("P003", "Bedak Tabur", 25, 45000));
    }

    public boolean login(String u, String p) {
        for (Admin a : daftarAdmin) {
            if (a.login(u, p)) {
                adminAktif = a;
                return true;
            }
        }
        return false;
    }

    public void tampilProduk() {
        System.out.println("\n--------------------------------------");
        System.out.println("           DAFTAR PRODUK              ");
        System.out.println("--------------------------------------");
        System.out.printf("%-10s %-20s %-8s %-10s\n", "KODE", "NAMA", "STOK", "HARGA");
        System.out.println("--------------------------------------");

        for (Produk p : daftarProduk) {
            System.out.printf("%-10s %-20s %-8d Rp%-10.0f\n",
                    p.getKode(), p.getNama(), p.getStok(), p.getHarga());
        }
        System.out.println("--------------------------------------");
    }

    public void tambahProduk(Scanner sc) {
        System.out.println("\n=== Tambah Produk Baru ===");
        System.out.print("Kode : ");
        String kode = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Stok : ");
        int stok = Integer.parseInt(sc.nextLine());
        System.out.print("Harga : ");
        double harga = Double.parseDouble(sc.nextLine());

        daftarProduk.add(new Produk(kode, nama, stok, harga));
        System.out.println("\n✅ Produk berhasil ditambahkan!");
    }

    public void transaksi(Scanner sc) {
        ArrayList<String> daftarBelanja = new ArrayList<>();
        double total = 0;

        System.out.println("\n=========== Transaksi Penjualan ===========");
        tampilProduk(); // 🟢 Daftar produk hanya ditampilkan sekali di awal

        while (true) {
            System.out.print("\nMasukkan kode produk (0 untuk selesai): ");
            String kode = sc.nextLine().trim();
            if (kode.equals("0")) break;

            Produk p = null;
            for (Produk pr : daftarProduk) {
                if (pr.getKode().equalsIgnoreCase(kode)) {
                    p = pr;
                    break;
                }
            }

            if (p == null) {
                System.out.println("⚠ Produk tidak ditemukan. Silakan coba lagi!");
                continue;
            }

            System.out.print("Jumlah beli : ");
            int qty = Integer.parseInt(sc.nextLine());

            if (qty > p.getStok()) {
                System.out.println("⚠ Stok tidak mencukupi!");
            } else {
                double subtotal = qty * p.getHarga();
                total += subtotal;
                p.kurangiStok(qty);
                daftarBelanja.add(String.format("%-20s x%-3d = Rp%.0f", p.getNama(), qty, subtotal));
                System.out.println("✅ Produk ditambahkan ke daftar belanja!");
            }
        }

        // Jika tidak ada transaksi, batalkan
        if (total == 0) {
            System.out.println("\n⚠ Tidak ada transaksi yang dilakukan.");
            return;
        }

        // Cetak struk belanja
        System.out.println("\n=========== STRUK PEMBELIAN ===========");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL BELANJA : Rp%.0f\n", total);

        // Input uang bayar dan validasi
        double bayar;
        while (true) {
            System.out.print("Uang bayar    : Rp");
            bayar = Double.parseDouble(sc.nextLine());
            if (bayar < total) {
                System.out.println("⚠ Uang tidak cukup, silakan masukkan ulang.");
            } else {
                break;
            }
        }

        double kembalian = bayar - total;
        System.out.printf("KEMBALIAN     : Rp%.0f\n", kembalian);
        System.out.println("========================================");
        System.out.println("   ✅ Transaksi berhasil, terima kasih!");
    }
}
