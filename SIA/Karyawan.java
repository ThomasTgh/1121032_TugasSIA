package SIA;

import java.util.ArrayList;

public class Karyawan extends Staff{
    Float salary;
    ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public Karyawan(String nama, String alamat, String telepon, String ttl, String NIK, Float salary) {
        super(nama, alamat, telepon, ttl, NIK);
        this.salary = salary;
    }

    public Float getSalary() {
        return this.salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return this.presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return "{" +
            " salary='" + getSalary() + "'" +
            ", presensi='" + getPresensi() + "'" +
            "}";
    }
    
    
}
