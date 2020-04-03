
import java.util.*;

public class Utama195150401111048{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();

        System.out.print("Masukkan Nomor Induk Pegawai : ");
        String nip = in.nextLine();

        System.out.print("Masukkan Tahun Masuk : ");
        int taonMasuk = in.nextInt();
        
        System.out.print("Berkeluarga (Y/N) ? ");
        String temp = in.nextLine();
        temp = in.nextLine();
        boolean keluarga;
        if (temp.equalsIgnoreCase("Y")){
            keluarga = true;
        } else {
            keluarga = false;
        }
        
        int jumlahAnak = 0;
        if (keluarga){
            System.out.print("Masukkan jumlah anak : ");
            jumlahAnak = in.nextInt();
        }
        
        System.out.print("Masukkan gaji pokok : Rp.");
        double gajiPokok = in.nextDouble();
        
        System.out.print("Masukkan Posisi / jabatan : ");
        String posisi = in.nextLine();
        posisi = in.nextLine();
        
        if(posisi.equalsIgnoreCase("manager")){
            Manager mantab = new Manager(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak);
            System.out.println();
            mantab.printAll();
        } else if(posisi.equalsIgnoreCase("freelance")){
            System.out.print("Masukkan jam kerja : ");
            int jamKerja = in.nextInt();
            Programmer mantab = new Programmer(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak,jamKerja);
            System.out.println();
            mantab.printAll();
        } else if (posisi.equalsIgnoreCase("sales")){
            System.out.print("Masukkan Harga Barang : Rp.");
            double hargaBarang = in.nextDouble();
            System.out.print("Masukkan Stok Barang : ");
            int stokBarang = in.nextInt();
            System.out.print("Masukkan Barang Terjual : ");
            int barangTerjual = in.nextInt();
            Sales mantab = new Sales(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak,hargaBarang,stokBarang,barangTerjual);
            System.out.println();
            mantab.printAll();
        } else{
            Pegawai mantab = new Pegawai(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak);
            System.out.println();
            mantab.printAll();
        }
        in.close(); 
    }
}