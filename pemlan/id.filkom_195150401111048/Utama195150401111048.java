// package id.filkom_195150401111048;

import java.util.*;

public class Utama195150401111048{
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        while (true) {
            Mahasiswa mahasiswa = new Mahasiswa();
            System.out.printf("%-35s : ","Masukkan Nama");
            String temp = scan.nextLine();
            mahasiswa.setNama(temp);
            System.out.printf("%-35s : ","Masukkan Alamat");
            temp = scan.nextLine();
            mahasiswa.setAlamat(temp);
            System.out.printf("%-35s : ","Masukkan Tanggal Lahir (DD MM YYYY)");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            mahasiswa.setLahir(a,b,c);
            System.out.printf("%-35s : ","Tambah Data Lagi? (Y/N)");
            String g = scan.nextLine();
            g = scan.nextLine();
            System.out.println();
            listMahasiswa.add(mahasiswa);
            if (g.equalsIgnoreCase("N")) break;
        }
        for (int i = 0;i<listMahasiswa.size();i++){
            listMahasiswa.get(i).showAll();
            System.out.println();
            System.out.println();
        }
    }
}
