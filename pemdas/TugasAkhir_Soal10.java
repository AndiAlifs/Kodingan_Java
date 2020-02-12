import java.util.Scanner;

public class TugasAkhir_Soal10 {

    static String[] tambahNama(String[] nama,String nama_new){
        String[] baru = new String[nama.length+1];
        for (int i=0;i<nama.length;i++) {
            baru[i] = nama[i];
        }
        baru[nama.length] = nama_new;
        return baru;
    }

    static String[] tambahAlamat(String[] alamat,String alamat_new){
        String[] baru = new String[alamat.length+1];
        for (int i=0;i<alamat.length;i++) {
            baru[i] = alamat[i];
        }
        baru[alamat.length] = alamat_new;
        return baru;
    }

    static String[] tambahNoTelp(String[] noTelp,String noTelp_new){
        String[] baru = new String[noTelp.length+1];
        for (int i=0;i<noTelp.length;i++) {
            baru[i] = noTelp[i];
        }
        baru[noTelp.length] = noTelp_new;
        return baru;
    }

    static String[] tambahOper(String[] oper,String oper_new){
        String[] baru = new String[oper.length+1];
        for (int i=0;i<oper.length;i++) {
            baru[i] = oper[i];
        }
        baru[oper.length] = oper_new;
        return baru;
    }

    static String[] tambahGrup(String[] grup,String grup_new){
        String[] baru = new String[grup.length+1];
        for (int i=0;i<grup.length;i++) {
            baru[i] = grup[i];
        }
        baru[grup.length] = grup_new;
        return baru;
    }

    static void cetakKontak(String nama,String alamat,String noTelp,String oper,String grup){
        System.out.printf("%-10s",nama);
        System.out.printf("%-20s",alamat);
        System.out.printf("%-11s",noTelp);
        System.out.printf("%-10s",oper);
        System.out.printf("%-20s%n",grup);
    };

    static void cetak1kontak(String nama,String alamat,String noTelp,String oper,String grup){

        System.out.printf("%-12s : %s%n","Nama",nama);
        System.out.printf("%-12s : %s%n","Alamat",alamat);
        System.out.printf("%-12s : %s%n","No. Hp",noTelp);
        System.out.printf("%-12s : %s%n","Provider",oper);
        System.out.printf("%-12s : %s%n","Grup",grup);
    };

    static void cetak1kontak_angka(String nama,String alamat,String noTelp,String oper,String grup){

        System.out.printf("1. %-12s : %s%n","Nama",nama);
        System.out.printf("2. %-12s : %s%n","Alamat",alamat);
        System.out.printf("3. %-12s : %s%n","No. Hp",noTelp);
        System.out.printf("4. %-12s : %s%n","Provider",oper);
        System.out.printf("5. %-12s : %s%n","Grup",grup);
        System.out.printf("6. %-12s %n","Selesai mengubah kontak");
    };

    static void cetakHeader(){

        System.out.printf("%-10s","NAMA");
        System.out.printf("%-20s","ALAMAT");
        System.out.printf("%-11s","NO. HP");
        System.out.printf("%-10s","PROVIDER");
        System.out.printf("%-20s%n","GRUP");
    }

    static String[] hapusNama(String[] nama,byte pilihan){
        String[] baru = new String[nama.length-1];
        for (int i=pilihan;i<nama.length-1;i++) {
            nama[i] = nama[i+1];
        }
        for(int i=0;i<baru.length;i++){
            baru[i] = nama[i];
        }
        return baru;
    }

    static String[] hapusAlamat(String[] alamat,byte pilihan){
        String[] baru = new String[alamat.length-1];
        for (int i=pilihan;i<alamat.length-1;i++) {
            alamat[i] = alamat[i+1];
        }
        for(int i=0;i<baru.length;i++){
            baru[i] = alamat[i];
        }
        return baru;
    }

    static String[] hapusNoTelp(String[] noTelp,byte pilihan){
        String[] baru = new String[noTelp.length-1];
        for (int i=pilihan;i<noTelp.length-1;i++) {
            noTelp[i] = noTelp[i+1];
        }
        for(int i=0;i<baru.length;i++){
            baru[i] = noTelp[i];
        }
        return baru;
    }

    static String[] hapusOper(String[] oper,byte pilihan){
        String[] baru = new String[oper.length-1];
        for (int i=pilihan;i<oper.length-1;i++) {
            oper[i] = oper[i+1];
        }
        for(int i=0;i<baru.length;i++){
            baru[i] = oper[i];
        }
        return baru;
    }

    static String[] hapusGrup(String[] grup,byte pilihan){
        String[] baru = new String[grup.length-1];
        for (int i=pilihan;i<grup.length-1;i++) {
            grup[i] = grup[i+1];
        }
        for(int i=0;i<baru.length;i++){
            baru[i] = grup[i];
        }
        return baru;
    }

    public static void main(String[] args) {
        String[] nama = {"Adi","Budi","Didin","Dodo","Candra","Lita","Nina","Citra","Tere"};
        String[] alamat = {"Jl. Sumbersari","Jl. Kertokertoan","Jl. Jalan","Jl. Sigura","Jl. Veteran","Griya shanta","Griya brawijaya","Rusunawa","Dieng"};
        String[] noTelp = {"081234568","088721381","087293819","081237821","098213458","081234111","089999222","086523246","088531516"};
        String[] oper = {"XL","Indosat","Simpati","Axis","3","Simpati","XL","Indosat","3"};
        String[] grup = {"Pemdas","Pemlan","Pemdas" ,"ASD","Pemlan" ,"ASD","Pemdas","Jarkom","Pemdas"};
        Scanner in = new Scanner(System.in);
        byte pil = 0;
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
            System.out.println();
            if (pil==1){
                System.out.println("======PENAMBAHAN KONTAK BARU======");
                System.out.print("Masukkan Nama : ");
                String nama_new = in.next();
                String alamat_new = in.nextLine();
                System.out.print("Masukkan Alamat : ");
                alamat_new = in.nextLine();
                System.out.print("Masukkan No Telepon : ");
                String noTelp_new = in.next();
                System.out.print("Masukkan Nama Operator : ");
                String oper_new = in.next();
                System.out.print("Masukkan Grup : ");
                String grup_new = in.next();
                System.out.println("======PENAMBAHAN KONTAK BARU SELESAI======");
                nama = tambahNama(nama,nama_new);
                alamat = tambahAlamat(alamat,alamat_new);
                noTelp = tambahNoTelp(noTelp,noTelp_new);
                oper = tambahOper(oper,oper_new);
                grup = tambahGrup(grup,grup_new);
            } else if (pil==2){
                int pil_kontak = 0;
                System.out.println("1. Menampilkan kontak seluruhnya");
                System.out.println("2. Menampilkan kontak per grup");
                System.out.print("Masukkan pilihan : ");
                pil_kontak = in.nextInt();
                if (pil_kontak==2){
                  System.out.println("1. Pemdas");
                  System.out.println("2. Pemlan");
                  System.out.println("3. ASD");
                  System.out.println("4. Jarkom");
                  System.out.print("Masukkan pilihan grup yang ingin ditampilkan : ");
                  pil_kontak = in.nextInt();
                  System.out.println("======DAFTAR KONTAK======");
                  cetakHeader();
                  if (pil_kontak==1){
                      for (int i=0;i<nama.length;i++) {
                          if (grup[i].equals("Pemdas")) cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                      };
                  } else if (pil_kontak==2){
                      for (int i=0;i<nama.length;i++) {
                          if (grup[i].equals("Pemlan")) cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                      };
                  } else if (pil_kontak==3){
                      for (int i=0;i<nama.length;i++) {
                          if (grup[i].equals("ASD")) cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                      };
                  } else if (pil_kontak==4){
                      for (int i=0;i<nama.length;i++) {
                          if (grup[i].equals("Jarkom")) cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                      };
                  };
                } else {
                  System.out.println("======DAFTAR KONTAK======");
                  cetakHeader();
                  for (int i=0;i<nama.length;i++) {
                      cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                  }
                };
            } else if (pil==3){
                System.out.println("======PENCARIAN NAMA======");
                System.out.print("Nama Yang Dicari : ");
                String cari_nama=in.next();
                System.out.printf("%s%n","-------------------------------------------");
                boolean nama_ada = false;
                int i =0;
                for (;i<nama.length;i++){
                    if (cari_nama.equals(nama[i])) {
                      nama_ada=true;
                      break;
                    }
                };
                if(!nama_ada){
                  System.out.println("====NAMA TIDAK DITEMUKAN====");
                } else {
                  cetak1kontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                  System.out.println("====PENCARIAN NAMA SELESAI====");
                };
            } else if (pil==4){
                System.out.println("======PENCARIAN NO. HP======");
                System.out.print("No. HP Yang Dicari : ");
                String cari_hp=in.next();
                System.out.printf("%s%n","-------------------------------------------");
                boolean hp_ada = false;
                int i =0;
                for (;i<nama.length;i++){
                    if (cari_hp.equals(noTelp[i])) {
                      hp_ada=true;
                      break;
                    }
                };
                if(!hp_ada){
                  System.out.println("====NO. HP TIDAK DITEMUKAN====");
                } else {
                  cetak1kontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                  System.out.println("====PENCARIAN NO. HP SELESAI====");
                };
            } else if (pil==5){
              System.out.println("======DAFTAR KONTAK======");
              System.out.printf("%-3s","No.");
              cetakHeader();
              for (int i=0;i<nama.length;i++) {
                  int nomor = i+1;
                  String no = String.valueOf(nomor);
                  System.out.printf("%-3s",no);
                  cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
              };
              System.out.print("Masukkan nomor kontak yang ingin diubah : ");
              byte pil_ubah = in.nextByte();
              pil_ubah-=(byte)1;
              byte ubah_data=0;
              do{
                  cetak1kontak_angka(nama[pil_ubah],alamat[pil_ubah],noTelp[pil_ubah],oper[pil_ubah],grup[pil_ubah]);
                  System.out.print("Masukkan data kontak yang ingin diubah : ");
                  ubah_data = in.nextByte();
                  if (ubah_data==1){
                      System.out.printf("%s : %s%n","Nama saat ini",nama[pil_ubah]);
                      System.out.printf("%s : ","Nama Baru");
                      nama[pil_ubah]=in.next();
                      System.out.println("DATA BERHASIL DIUBAH");
                  } else if (ubah_data==2){
                      System.out.printf("%s : %s%n","Alamat saat ini",alamat[pil_ubah]);
                      System.out.printf("%s : ","Alamat baru");
                      alamat[pil_ubah]=in.nextLine();
                      alamat[pil_ubah]=in.nextLine();
                      System.out.println("DATA BERHASIL DIUBAH");
                  } else if (ubah_data==3){
                      System.out.printf("%s : %s%n","No. Hp saat ini",noTelp[pil_ubah]);
                      System.out.printf("%s : ","No. Hp baru");
                      noTelp[pil_ubah]=in.next();
                      System.out.println("DATA BERHASIL DIUBAH");
                  } else if (ubah_data==4){
                      System.out.printf("%s : %s%n","Provider saat ini",oper[pil_ubah]);
                      System.out.printf("%s : ","Provider baru");
                      oper[pil_ubah]=in.next();
                      System.out.println("DATA BERHASIL DIUBAH");
                  } else if (ubah_data==5){
                      System.out.printf("%s : %s%n","Grup saat ini",grup[pil_ubah]);
                      System.out.printf("%s : ","Grup baru");
                      grup[pil_ubah]=in.next();
                      System.out.println("DATA BERHASIL DIUBAH");
                  };
                  System.out.println();
              } while(ubah_data!=6);
            } else if (pil==6){
                System.out.println("======DAFTAR KONTAK======");
                System.out.printf("%-3s","No.");
                cetakHeader();
                for (int i=0;i<nama.length;i++) {
                    int nomor = i+1;
                    String no = String.valueOf(nomor);
                    System.out.printf("%-3s",no);
                    cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
                };
                System.out.print("Masukkan nomor kontak yang ingin dihapus : ");
                byte hapus_data = in.nextByte(); hapus_data--;
                String simpan_nama = nama[hapus_data];
                System.out.printf("Apakah anda yakin ingin menghapus kontak  %s (1. Ya / 2. Tidak) : ",simpan_nama);
                byte konfirm_hapus_data = in.nextByte();
                if(konfirm_hapus_data==1){
                    nama = hapusNama(nama,hapus_data);
                    alamat = hapusAlamat(alamat,hapus_data);
                    noTelp = hapusNoTelp(noTelp,hapus_data);
                    oper = hapusOper(oper,hapus_data);
                    grup = hapusGrup(grup,hapus_data);
                };
                System.out.printf("Kontak --%s-- Telah Dihapus %n",simpan_nama);
            };
            System.out.println();
        };
        System.out.println("======PROGRAM SELESAI======");
    }
}
