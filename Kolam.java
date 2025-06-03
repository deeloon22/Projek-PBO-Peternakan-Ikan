public class Kolam {
    private String idKolam;
    private String namaKolam;
    private String lokasi;
    private double ukuranKolam;   // dalam meter persegi
    private String jenisKolam;    // misalnya: terpal, beton, tanah

    // Konstruktor lengkap
    public Kolam(String idKolam, String namaKolam, String lokasi, double ukuranKolam, String jenisKolam) {
        this.idKolam = idKolam;
        this.namaKolam = namaKolam;
        this.lokasi = lokasi;
        this.ukuranKolam = ukuranKolam;
        this.jenisKolam = jenisKolam;
    }

    // Konstruktor default (opsional)
    public Kolam() {
        this.idKolam = "";
        this.namaKolam = "";
        this.lokasi = "";
        this.ukuranKolam = 0.0;
        this.jenisKolam = "";
    }

    // Setter
    public void setIdKolam(String idKolam) {
        this.idKolam = idKolam;
    }

    public void setNamaKolam(String namaKolam) {
        this.namaKolam = namaKolam;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setUkuranKolam(double ukuranKolam) {
        this.ukuranKolam = ukuranKolam;
    }

    public void setJenisKolam(String jenisKolam) {
        this.jenisKolam = jenisKolam;
    }

    // Getter
    public String getIdKolam() {
        return idKolam;
    }

    public String getNamaKolam() {
        return namaKolam;
    }

    public String getLokasi() {
        return lokasi;
    }

    public double getUkuranKolam() {
        return ukuranKolam;
    }

    public String getJenisKolam() {
        return jenisKolam;
    }

    // Method untuk menampilkan informasi kolam
    public void dataKolam() {
        System.out.println("ID Kolam     : " + idKolam);
        System.out.println("Nama Kolam   : " + namaKolam);
        System.out.println("Lokasi       : " + lokasi);
        System.out.println("Ukuran Kolam : " + ukuranKolam + " m2");
        System.out.println("Jenis Kolam  : " + jenisKolam);
    }
}
