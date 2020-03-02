// package id.filkom_195150401111048;

import java.text.SimpleDateFormat;
import java.util.*;

public class Mahasiswa{
    String nama = "";
    String alamat = "";
    Date tglLahir = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    String tgl ="";

    public void setNama(String a) {
        this.nama = a;
    }

    public void setAlamat(String a){
        this.alamat = a;
    }

    public void setLahir(int a,int b,int c){
        Calendar myCalendar = new GregorianCalendar(c, b-1, a);
        this.tglLahir = myCalendar.getTime();
        this.tgl = sdf.format(tglLahir);
    }

    void showAll(){
        System.out.printf("%-15s: %s%n","Nama",this.nama);
        System.out.printf("%-15s: %s%n","Alamat",this.alamat);
        System.out.printf("%-15s: %s","Tanggal Lahir",this.tgl);
    }
}
