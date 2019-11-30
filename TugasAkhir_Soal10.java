import java.util.Scanner;

public class TugasAkhir_Soal10 {
    static String[] nama = {"Adi","Budi","Didin","Dodo","Candra","Lita","Nina","Citra","Tere"};
    static String[] alamat = {"Jl. Sumbersari","Jl. Kertokertoan","Jl. Jalan","Jl. Sigura","Jl. Veteran","Griya shanta","Griya brawijaya","Rusunawa","Dieng"};
    static String[] noTelp = {"081234568","088721381","087293819","081237821","098213458","081234111","089999222","08652324","123131414"};
    static String[] oper = {"XL","Indosat","Simpati","Axis","3","Simpati","XL","Indosat","3"};
    static String[] grup = {"Pemdas","Pemlan","Pemdas" ,"ASD","Pemlan" ,"ASD","Pemdas","Jarkom ","Pemdas"};

    static void cetakKontak(){
        System.out.printf("%-10s","NAMA");
        System.out.printf("%-20s","ALAMAT");
        System.out.printf("%-11s","NO. TELP");
        System.out.printf("%-10s","OPERATOR");
        System.out.printf("%-20s%n","GRUP")    ;

        for (int i=0;i<nama.length;i++){
            System.out.printf("%-10s",nama[i]);
            System.out.printf("%-20s",alamat[i]);
            System.out.printf("%-11s",noTelp[i]);
            System.out.printf("%-10s",oper[i]);
            System.out.printf("%-20s%n",grup[i]);


        };
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte pil = 0;
        System.out.println();
        while (pil!=7){
            System.out.println("1. Menambah Kontak baru");
            System.out.println("2. Mencetak Kontak");
            System.out.println("3. Mencari Kontak Berdasarkan Nama");
            System.out.println("4. Mencari Kontak Berdasarkan Nomor Telefon");
            System.out.println("5. Mengubah Data Pada Kontak");
            System.out.println("6. Menghapus Kontak Pada Daftar");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pil = in.nextByte();
            switch(pil){
              case 1:
              case 2: cetakKontak();
              case 3:
              case 4:
              case 5:
              case 6:
            };
            System.out.println();


            System.out.println();
        };
          System.out.println(alamat[0]);
    }
}
