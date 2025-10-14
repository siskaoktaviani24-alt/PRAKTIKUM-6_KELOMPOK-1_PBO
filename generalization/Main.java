package generalization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Lipstick lipstick = new Lipstick("Maybelline Matte", 75000, "Merah Muda");
        Foundation foundation = new Foundation("Wardah Liquid", 120000, "Normal");
        Maskara maskara = new Maskara("L'Oreal Lash", 95000, true);

        List<ProdukMakeup> daftarProduk = new ArrayList<>();
        daftarProduk.add(lipstick);
        daftarProduk.add(foundation);
        daftarProduk.add(maskara);

        for (ProdukMakeup produk : daftarProduk) {
            if (produk instanceof Lipstick) {
                System.out.println(((Lipstick) produk).getDeskripsi());
            } else if (produk instanceof Foundation) {
                System.out.println(((Foundation) produk).getDeskripsi());
            } else if (produk instanceof Maskara) {
                System.out.println(((Maskara) produk).getDeskripsi());
            }
        }
    }
}