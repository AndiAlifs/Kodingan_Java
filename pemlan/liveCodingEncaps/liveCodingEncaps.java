import java.util.*;

class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;


    //lengkapi kode dari sini
    //atribut static jumlah mahasiswa / jumlah object
    public static int jumlahMahasiswa = 0;

    //attribut final KAMPUS
    final public String KAMPUS;

    //konstuktor tanpa parameter
    public Mahasiswa(){
        this.KAMPUS = "UB";
        jumlahMahasiswa++;
    }

    //Konstruktor parameter nama, nim, dan KAMPUS
    public Mahasiswa(String nama, String nim, String kamp){
        this.nama = nama;
        this.nim = nim;
        this.nilai = 50;
        this.KAMPUS = kamp;
        jumlahMahasiswa++;
    }

    //Konstruktor parameter nama, nim, nilai, dan KAMPUS
    public Mahasiswa(String nama, String nim, int nilai, String kamp){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.KAMPUS = kamp;
        jumlahMahasiswa++;
    }

    //setter atribut nama dari objek
    public void setNama(String n){
        this.nama = n;
    }

    //setter atribut NIM dari objek
    public void setNim(String n){
        this.nim = n;
    }

    //setter atribut Nilai dari objek
    public void setNilai(int n){
        this.nilai = n;
    }

    //getter atribut nama dari objek
    private String getNama(){
        return this.nama;
    }

    //getter atribut NIM dari objek
    private String getNim(){
        return this.nim;
    }

    //getter atribut nilai dari objek
    private int getNilai(){
        int temp = this.nilai;
        return temp;
    }
    // akhir kode yang boleh anda isi

    @Override
    public String toString(){
        return String.format(
                "Nama : %s\n"
                + "Nim  : %s\n"
                + "Nilai : %d\n"
                + "Kampus : %s\n", getNama(), getNim(), getNilai(),KAMPUS);

    }
}



public class liveCodingEncaps {
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

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
