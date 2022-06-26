package SIA;

import java.util.ArrayList;

public class MatkulAmbil {
    Matkul matkul;
    ArrayList<Presensi> presensi = new ArrayList<>();
    int n1;
    int n2;
    int n3;

    public MatkulAmbil(Matkul matkul, int n1, int n2, int n3) {
        this.matkul = matkul;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Matkul getMatkul() {
        return this.matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public ArrayList<Presensi> getPresensi() {
        return this.presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return this.n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return this.n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return this.n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "{" +
            " matkul='" + getMatkul() + "'" +
            ", presensi='" + getPresensi() + "'" +
            ", n1='" + getN1() + "'" +
            ", n2='" + getN2() + "'" +
            ", n3='" + getN3() + "'" +
            "}";
    }

}
