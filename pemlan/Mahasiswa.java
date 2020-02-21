public class Mahasiswa{
    String nama = "";
    String nim = "";

    Mahasiswa(String nam, String ni){
        nama = nam;
        nim = ni;
    }

    void show(){
        System.out.printf("%-8s: %s%n","Nama",this.nama);
        System.out.printf("%-8s: %s","NIM",this.nim);
    }
}