package SIA;

abstract class User {
    String nama;
    String alamat;
    String telepon;
    String ttl;

    public User(String nama, String alamat, String telepon, String ttl) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.ttl = ttl;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTtl() {
        return this.ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
    @Override
    public String toString() {
        return "{" +
            " nama='" + getNama() + "'" +
            ", alamat='" + getAlamat() + "'" +
            ", telepon='" + getTelepon() + "'" +
            ", ttl='" + getTtl() + "'" +
            "}";
    }

}
