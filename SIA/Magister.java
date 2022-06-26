package SIA;

public class Magister extends Sarjana {
    String JudulTesis;

    public Magister(String nama, String alamat, String telepon, String ttl, String nim, String jurusan, String JudulTesis) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
        this.JudulTesis = JudulTesis;
    }

    public String getJudulTesis() {
        return this.JudulTesis;
    }

    public void setJudulTesis(String JudulTesis) {
        this.JudulTesis = JudulTesis;
    }

    @Override
    public String toString() {
        return "{" +
            " JudulTesis='" + getJudulTesis() + "'" +
            "}";
    }
    
}
