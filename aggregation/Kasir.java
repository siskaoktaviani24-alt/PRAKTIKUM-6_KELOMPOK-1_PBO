public class Kasir {
    private String namaKasir;

    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void tampilkanInfo() {
        System.out.println("Kasir           : " + namaKasir);
    }
}
