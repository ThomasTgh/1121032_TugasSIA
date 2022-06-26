package SIA;

public class dummy {
    public static User[] initialize(){
        String nama = "Udin";
        String alamat = "Jl. Kenangan";
        String telepon = "123456789123";
        String ttl = "Rumah sakit";
        String nim = "112233";
        String jurusan = "Informatika";
        Sarjana sarjana = new Sarjana(nama, alamat, telepon, ttl, nim, jurusan);
        nama = "Ujang Cornetto";
        alamat = "Jl. Masalah";
        telepon = "890123456789";
        ttl = "Rumah sehat";
        nim = "223344";
        jurusan = "Manajemen";
        String JudulTesis = "Kenapa Saya Hidup";
        Magister magister = new Magister(nama, alamat, telepon, ttl, nim, jurusan, JudulTesis);
        nama = "Bambang Lesmana";
        alamat = "Jl. Mulu Nikahnya kapan";
        telepon = "098765432123";
        ttl = "Bumi";
        nim = "33445566";
        jurusan = "Blockchain";
        String judulDisertasi = "Kenapa chain harus diblock";
        Doktor doktor = new Doktor(nama, alamat, telepon, ttl, nim, jurusan, judulDisertasi);
        nama = "Rudi";
        alamat = "Jl. penderitaan";
        telepon = "1122334455667788";
        ttl = "Kampus";
        String NIK = "1234567890";
        String departemen = "Informatika";
        int salary = 20000000;
        DosenTetap dosen1 = new DosenTetap(nama, alamat, telepon, ttl, NIK, departemen, salary);
        nama = "Asep";
        alamat = "Jl. sibuk";
        telepon = "1122334455667788";
        ttl = "Kampus";
        NIK = "1234567890";
        departemen = "Informatika";
        int HonorPerSKS = 5000000;
        DosenHonorer dosen2 = new DosenHonorer(nama, alamat, telepon, ttl, NIK, departemen, HonorPerSKS);
        nama = "Jajang";
        alamat = "Jl. sendirian";
        telepon = "556677889900";
        ttl = "Kampus";
        NIK = "2345678901";
        float salary_f = 5000000;
        Karyawan karyawan = new Karyawan(nama, alamat, telepon, ttl, NIK, salary_f);
        User[] users = new User[] {sarjana, doktor, magister, dosen1, dosen2, karyawan};
        return users;
    }
}
