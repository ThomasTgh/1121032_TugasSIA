package SIA;

abstract class Staff extends User {
    String NIK;

    public Staff(String nama, String alamat, String telepon, String ttl, String NIK) {
        super(nama, alamat, telepon, ttl);
        this.NIK = NIK;
    }

    public String getNIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return "{" +
            " NIK='" + getNIK() + "'" +
            "}";
    }

}
