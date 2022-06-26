package SIA;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa{
    ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();

    public Sarjana(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
    }

    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return this.matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    @Override
    public String toString() {
        return "{" +
            " matkulAmbil='" + getMatkulAmbil() + "'" +
            "}";
    }
    
}
