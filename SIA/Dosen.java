package SIA;

import java.util.ArrayList;

abstract class Dosen extends Staff{
    String departemen;
    ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();

    public Dosen(String nama, String alamat, String telepon, String ttl, String NIK, String departemen) {
        super(nama, alamat, telepon, ttl, NIK);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return this.departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return this.matkulAjar;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    @Override
    public String toString() {
        return "{" +
            " departemen='" + getDepartemen() + "'" +
            ", matkulAjar='" + getMatkulAjar() + "'" +
            "}";
    }

}
