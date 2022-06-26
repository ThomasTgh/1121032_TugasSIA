package SIA;

public class Matkul {
    String kode;
    int SKS;
    String nama;

    public Matkul(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "{" +
            " kode='" + getKode() + "'" +
            ", SKS='" + getSKS() + "'" +
            ", nama='" + getNama() + "'" +
            "}";
    }
    
}
