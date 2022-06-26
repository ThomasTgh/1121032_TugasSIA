package SIA;

public class DosenTetap extends Dosen {
    double salary;

    public DosenTetap(String nama, String alamat, String telepon, String ttl, String NIK, String departemen, double salary) {
        super(nama, alamat, telepon, ttl, NIK, departemen);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
            " salary='" + getSalary() + "'" +
            "}";
    }
    
}
