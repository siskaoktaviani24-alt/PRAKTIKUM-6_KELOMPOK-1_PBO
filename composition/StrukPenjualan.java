// StrukPenjualan.java
package composition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StrukPenjualan {
    private String nomorStruk;
    private String tanggalCetak;

    public StrukPenjualan(String nomorStruk) {
        this.nomorStruk = nomorStruk;
        this.tanggalCetak = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss"));
    }

    public String getNomorStruk() {
        return nomorStruk;
    }

    public String getTanggalCetak() {
        return tanggalCetak;
    }
}
