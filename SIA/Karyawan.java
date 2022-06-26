package SIA;

import java.util.ArrayList;

public class Karyawan extends Staff{
    Float salary;
    ArrayList<PresensiStaff> presensi = new ArrayList<>();
    public void setSalary(Float salary){
        this.salary = salary;
    }

    public Float getSalary(){
        return salary;
    }
}
