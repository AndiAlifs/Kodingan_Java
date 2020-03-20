
import java.util.*;


class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;

    //lengkapi kode dari sini

    private String KAMPUS;
    public Mahasiswa (String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.KAMPUS = "UI";
    }
    public Mahasiswa (String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.nilai = 50;
        this.KAMPUS = "ITS";
    }
    public Mahasiswa (){}

    public String getNama(){
        return nama;
    }
    public void setNama( String temp){
        nama = temp;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String temp){
        nim = temp;
    }
    public int getNilai(){
        return nilai;
    }
    public void setNilai( int temp){
        nilai = temp;
    }
     public String getKampus() {
        return KAMPUS;
    }

    public void setKampus(String temp) {
        KAMPUS = temp;
    }

    // akhir kode yang boleh anda isi
    @Override
    public String toString(){
        return String.format("Nama : %s\nNim  : %s\nNilai : %d\nKampus : %s\n", getNama(), getNim(), getNilai(),getKampus());

    }
}



public class kodinGilang {
    public static void main(String[] args) {
         for (int i = 0; i <= 3; i++) {
            System.out.println("Jumlah Mahasiswa : " + i);
        }
        Scanner in = new Scanner(System.in);
        Mahasiswa m1 = new Mahasiswa("Rama Bena", "185150201111029", 98);
        Mahasiswa m2 = new Mahasiswa("ibrahim", "1850502001111041");
        Mahasiswa m3 = new Mahasiswa();
        String nama = in.nextLine();
        String nim = in.nextLine();
        int nilai = in.nextInt();
        String k = in.nextLine();
        m3.setNama(nama);
        m3.setNim(nim);
        m3.setNilai(nilai);
        m3.setKampus(k);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
