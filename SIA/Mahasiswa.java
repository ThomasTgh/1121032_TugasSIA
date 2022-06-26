package SIA;

abstract class Mahasiswa extends User{
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "{" +
            " nim='" + getNim() + "'" +
            ", jurusan='" + getJurusan() + "'" +
            "}";
    }

}
