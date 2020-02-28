import java.util.*;


class Mahasiswa{
    private String nama;
    private String nim;
    private int nilai;

	//lengkapi kode dari sini
    public Mahasiswa(){
    }

    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.nilai = 50;
    }

    public Mahasiswa(String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public void setNama(String n){
        this.nama = n;
    }

    public void setNim(String n){
        this.nim = n;
    }

    public void setNilai(int n){
        this.nilai = n;
    }

    private String getNama(){
        return this.nama;
    }

    private String getNim(){
        return this.nim;
    }

    private int getNilai(){
        int temp = this.nilai;
        return temp;
    }

    // akhir kode yang boleh anda isi
    @Override
    public String toString(){
        return String.format("Nama : %s\nNim  : %s\nNilai : %d\n", getNama(), getNim(), getNilai());
    }
}



public class latihanLiveCoding01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mahasiswa m1 = new Mahasiswa("Rama Bena", "185150201111029", 98);
        Mahasiswa m2 = new Mahasiswa("ibrahim", "1850502001111041");
        Mahasiswa m3 = new Mahasiswa();
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
