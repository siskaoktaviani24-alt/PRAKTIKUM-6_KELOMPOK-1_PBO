public class ProdukMakeup {
    private String namaProduk;
    private int harga;

    public ProdukMakeup(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println(namaProduk + " dengan harga Rp" + harga + " telah terjual.");
    }
}
