package SIA;

public class Doktor extends Mahasiswa {
    String judulDisertasi;
    double nilaiSidang1;
    double nilaiSidang2;
    double nilaiSidang3;

    public Doktor(String nama, String alamat, String telepon, String ttl, String nim, String jurusan, String judulDisertasi) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
    }

    public String getJudulDisertasi() {
        return this.judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public double getNilaiSidang1() {
        return this.nilaiSidang1;
    }

    public void setNilaiSidang1(double nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public double getNilaiSidang2() {
        return this.nilaiSidang2;
    }

    public void setNilaiSidang2(double nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public double getNilaiSidang3() {
        return this.nilaiSidang3;
    }

    public void setNilaiSidang3(double nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return "{" +
            " judulDisertasi='" + getJudulDisertasi() + "'" +
            ", nilaiSidang1='" + getNilaiSidang1() + "'" +
            ", nilaiSidang2='" + getNilaiSidang2() + "'" +
            ", nilaiSidang3='" + getNilaiSidang3() + "'" +
            "}";
    }
    
}
