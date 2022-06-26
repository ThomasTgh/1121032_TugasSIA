package SIA;

import javax.swing.JOptionPane;

public class NA {
    public static void NASarjana(Sarjana sarjana, String kodeMK){
        double nilaifinal = 0;
        for(int i = 0; i < sarjana.matkulAmbil.size(); i++){
            if(sarjana.matkulAmbil.get(i).matkul.kode.equals(kodeMK)){
                nilaifinal = (sarjana.matkulAmbil.get(i).n1 + sarjana.matkulAmbil.get(i).n2 + sarjana.matkulAmbil.get(i).n3)/3;
            }
        }
        JOptionPane.showMessageDialog(null, "Nama: "+ sarjana.nama + "\nNilai akhir: "+nilaifinal);
    }

    public static void NAMagister(Magister magister, String kodeMK){    
        double nilaifinal = 0;
        for(int i = 0; i < magister.matkulAmbil.size(); i++){
            if(magister.matkulAmbil.get(i).matkul.kode.equals(kodeMK)){
                nilaifinal = (magister.matkulAmbil.get(i).n1 + magister.matkulAmbil.get(i).n2 + magister.matkulAmbil.get(i).n3)/3;
            }
        }
        JOptionPane.showMessageDialog(null, "Nama: "+ magister.nama + "\nNilai akhir: "+nilaifinal);
    }

    public static void NADoktor(Doktor doktor){
        double nilaifinal = (doktor.nilaiSidang1+ doktor.nilaiSidang2 + doktor.nilaiSidang3)/3;
        JOptionPane.showMessageDialog(null, "Nama: "+doktor.nama+"\nNilai akhir: "+nilaifinal);
    }
}
