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

    static void cetakHeader(){

        System.out.printf("%-10s","NAMA");
        System.out.printf("%-20s","ALAMAT");
        System.out.printf("%-11s","NO. HP");
        System.out.printf("%-10s","PROVIDER");
        System.out.printf("%-20s%n","GRUP");
    }

    public static void main(String[] args) {
        String[] nama = {"Adi","Budi","Didin","Dodo","Candra","Lita","Nina","Citra","Tere"};
        String[] alamat = {"Jl. Sumbersari","Jl. Kertokertoan","Jl. Jalan","Jl. Sigura","Jl. Veteran","Griya shanta","Griya brawijaya","Rusunawa","Dieng"};
        String[] noTelp = {"081234568","088721381","087293819","081237821","098213458","081234111","089999222","086523246","088531516"};
        String[] oper = {"XL","Indosat","Simpati","Axis","3","Simpati","XL","Indosat","3"};
        String[] grup = {"Pemdas","Pemlan","Pemdas" ,"ASD","Pemlan" ,"ASD","Pemdas","Jarkom ","Pemdas"};
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
              System.out.printf("%-5s","No.");
              cetakHeader();
              for (int i=0;i<nama.length;i++) {
                  System.out.printf("%s%-4s",i+1,".");
                  cetakKontak(nama[i],alamat[i],noTelp[i],oper[i],grup[i]);
              };
            }
            // } else if (pil==6){
            //
            // };
            System.out.println();
            System.out.println();
        };
        System.out.println("======PROGRAM SELESAI======");
    }
}
