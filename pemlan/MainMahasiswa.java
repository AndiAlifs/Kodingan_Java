package Laporan3;
import java.util.*;

class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;
    private String univ;
    public static int jumlahMahasiswa;
    public static final String KAMPUS = "UB";

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setUniv(){
        this.univ = KAMPUS;
    }

    public String getUniv(){
        return this.univ;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.univ = Mahasiswa.KAMPUS;
        jumlahMahasiswa++;
    }

    public Mahasiswa(String nama, String nim, int nilai, String univ) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.univ = "UI";
        jumlahMahasiswa++;
    }

    public Mahasiswa(String nama, String nim, String kampus) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = 50;
        this.univ = "ITS";
        jumlahMahasiswa++;
    }

    public Mahasiswa() {
        jumlahMahasiswa++;
    }


    @Override
    public String toString(){
        return String.format(
                "Nama : %s\n"
              + "Nim  : %s\n"
              + "Nilai : %d\n"
              + "Kampus : %s\n", getNama(), getNim(), getNilai(),getUniv());

    }
}
public class MainMahasiswa{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.jumlahMahasiswa);

        Mahasiswa m1 = new Mahasiswa("Rama Bena", "185150201111029", 98,"UI");
        System.out.println("Jumlah Mahasiswa : " + m1.jumlahMahasiswa);

        Mahasiswa m2 = new Mahasiswa("ibrahim", "1850502001111041","ITS");
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.jumlahMahasiswa);

        Mahasiswa m3 = new Mahasiswa();
        System.out.println("Jumlah Mahasiswa : " + m3.jumlahMahasiswa);

        String nama = in.nextLine();
        String nim = in.nextLine();
        int nilai = in.nextInt();
        m3.setNama(nama);
        m3.setNim(nim);
        m3.setNilai(nilai);
        m3.setUniv();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
