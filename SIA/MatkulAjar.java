package SIA;

import java.util.ArrayList;

public class MatkulAjar {
    Matkul Matkul;
    ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public MatkulAjar(Matkul Matkul) {
        this.Matkul = Matkul;
    }

    public Matkul getMatkul() {
        return this.Matkul;
    }

    public void setMatkul(Matkul Matkul) {
        this.Matkul = Matkul;
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
            " Matkul='" + getMatkul() + "'" +
            ", presensi='" + getPresensi() + "'" +
            "}";
    }

}
