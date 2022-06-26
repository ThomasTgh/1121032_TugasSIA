package SIA;

public class DosenHonorer extends Dosen{
    double HonorPerSKS;

    public DosenHonorer(String nama, String alamat, String telepon, String ttl, String NIK, String departemen, double HonorPerSKS) {
        super(nama, alamat, telepon, ttl, NIK, departemen);
        this.HonorPerSKS = HonorPerSKS;
    }

    public double getHonorPerSKS() {
        return this.HonorPerSKS;
    }

    public void setHonorPerSKS(double HonorPerSKS) {
        this.HonorPerSKS = HonorPerSKS;
    }

    @Override
    public String toString() {
        return "{" +
            " HonorPerSKS='" + getHonorPerSKS() + "'" +
            "}";
    }

    
}
