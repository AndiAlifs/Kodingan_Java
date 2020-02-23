package id.filkom_195150401111048;

import java.text.SimpleDateFormat;
import java.util.*;

public class Utama195150401111048{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.printf("%-35s : ","Masukkan Nama");
        String temp = scan.nextLine();
        mahasiswa.setNama(temp);
        System.out.printf("%-35s : ","Masukkan Alamat");
        temp = scan.nextLine();
        System.out.printf("%-35s : ","Masukkan Tanggal Lahir (DD MM YYYY)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        mahasiswa.setLahir(a,b,c);
        System.out.println();
        mahasiswa.setAlamat(temp);
        mahasiswa.showAll();
    }
}