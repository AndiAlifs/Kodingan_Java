
import java.util.*;

public class Utama195150401111048{
    public static void main(String[] args) {
        //Memanggil scanner dengan nama in
        Scanner in = new Scanner(System.in);

        //Menerima input nama
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();

        //Menerima input Nomor Induk
        System.out.print("Masukkan Nomor Induk Pegawai : ");
        String nip = in.nextLine();

        //Menerima input tahun masuk
        System.out.print("Masukkan Tahun Masuk : ");
        int taonMasuk = in.nextInt();

        //Menerima inputan apakah berkeluarga atau tidak
        System.out.print("Berkeluarga (Y/N) ? ");
        String temp = in.nextLine();
        temp = in.nextLine();
        boolean keluarga;
        if (temp.equalsIgnoreCase("Y")){
            keluarga = true;
        } else {
            keluarga = false;
        }

        //Menerima input jumlah anak apabila berkeluarga
        int jumlahAnak = 0;
        if (keluarga){
            System.out.print("Masukkan jumlah anak : ");
            jumlahAnak = in.nextInt();
        }

        //Menerima input gaji pokok
        System.out.print("Masukkan gaji pokok : Rp.");
        double gajiPokok = in.nextDouble();

        //Menerima input posisi / jabatan
        System.out.print("Masukkan Posisi / jabatan : ");
        String posisi = in.nextLine();
        posisi = in.nextLine();

        //Jika posisi adalah manager, membuat objek dari kelas Manager
        if(posisi.equalsIgnoreCase("manager")){
            //Instansiasi objek dari kelas manager dengan nama, nomor induk, tahun masuk, gaji pokok, berkeluarga, dan jumlah anak
            Manager mantab = new Manager(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak);
            System.out.println();
            //Menampilkan attribut dari objek
            mantab.printAll();
        //Jika posisi adalah freelance, membuat objek dari kelas Programmer
        } else if(posisi.equalsIgnoreCase("freelance")){
            //Menerima input untuk jam kerja
            System.out.print("Masukkan jam kerja : ");
            int jamKerja = in.nextInt();
            //Instansiasi objek dari kelas manager dengan nama, nomor induk, tahun masuk, gaji pokok, berkeluarga, jumlah anak, dan jam kerja
            Programmer mantab = new Programmer(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak,jamKerja);
            System.out.println();
            //Menampilkan attribut dari objek
            mantab.printAll();
        //Jika posisi adalah sales, membuat objek dari kelas Sales
        } else if (posisi.equalsIgnoreCase("sales")){
            System.out.print("Masukkan Harga Barang : Rp.");
            double hargaBarang = in.nextDouble();
            System.out.print("Masukkan Stok Barang : ");
            int stokBarang = in.nextInt();
            System.out.print("Masukkan Barang Terjual : ");
            int barangTerjual = in.nextInt();
            System.out.println();
            //Instansiasi objek dari kelas manager dengan nama, nomor induk, tahun masuk, gaji pokok, berkeluarga, jumlah anak, harga barang, stok barang, dan barang terjual
            Sales mantab = new Sales(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak,hargaBarang,stokBarang,barangTerjual);
            //Menampilkan attribut dari objek
            mantab.printAll();
        //Jika posisi selain manager, freelance, dan Sales, maka membuat objek dari kelas Pegawai
        } else{
            //Instansiasi objek dari kelas manager dengan nama, nomor induk, tahun masuk, gaji pokok, berkeluarga, dan jumlah anak
            Pegawai mantab = new Pegawai(nama,nip,taonMasuk,gajiPokok,keluarga,jumlahAnak);
            System.out.println();
            //Menampilkan attribut dari objek
            mantab.printAll();
        }
        //menutup scanner objek
        in.close();
    }
}
