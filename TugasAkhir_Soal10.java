import java.util.Scanner;

public class TugasAkhir_Soal0 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil = 0;
        while (pil!=0){
            System.out.println("1. Menambah Kontak baru");
            System.out.println("2. Mencetak Kontak");
            System.out.println("3. Mencari Kontak Berdasarkan Nama");
            System.out.println("4. Mencari Kontak Berdasarkan Nomor Telefon");
            System.out.println("5. Mengubah Data Pada Kontak");
            System.out.println("6. Menghapus Kontak Pada Daftar");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            int pil = in.nextInt();

        };
        System.out.println("PROGRAM TELAH SELESAI");
    }
}
