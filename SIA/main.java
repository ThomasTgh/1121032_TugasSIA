package SIA;

public class main {
    public static String check(User u, String code){
        String status = "unknown";
        if(u instanceof Sarjana){
            if(u.nama.equals(code)){
                return "Sarjana";
            }
        }else if(u instanceof Magister){
            if(u.nama.equals(code)){
                return "Magister";
            }
        }else if(u instanceof Doktor){
            if(u.nama.equals(code)){
                return "Doktor";
            }
        }else if(u instanceof DosenTetap){
            if(u.nama.equals(code)){
                return "Dosen tetap";
            }
        }else if(u instanceof DosenHonorer){
            if(u.nama.equals(code)){
                return "Dosen honorer";
            }
        }else if(u instanceof Karyawan){
            if(u.nama.equals(code)){
                return "Karyawan";
            }
        }
        return status;
    }
    public static void printData(User[] u, String nama){
        String status = "";
        String output = "";
        for(int i = 0; i < u.length; i++){
            status = check(u[i], nama);
            if(!status.equals("unknown")){
                output += "nama: "+u[i].nama
                +"ttl: "+u[i].ttl
                +"alamat: "+u[i].alamat
                +"telepon: "+u[i].telepon
                +""+u[i];
            }
        }
        for (User user : u) {
            check(u, nama);
        }
        System.out.println(output);
    }
    public static void printNA(User[] u, String nama, String kodeMK){
        String code = "";
        for(int i = 0; i < u.length; i++){
            code = check(u[i], nama);
            switch (code) {
                case "Sarjana":
                    NA.NASarjana(u[i], kodeMK);
                    break;
                case "Magister":
                    NA.NAMagister(u[i], kodeMK);
                    break;
                case "Doktor":
                    NA.NADoktor(u[i]);
                    break;
            }
        }
        
    }

    public static void main(String[] args) {
        User[] u = dummy.initialize();
        String code = "Udin";
        printData(u, code);
    }
}