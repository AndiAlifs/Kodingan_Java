//import library java.util
import java.util.*;

public class Main{
    public static void main(String[] args) {
        boolean isWeekend = false;
        ArrayList<Integer> daftarKamar = new ArrayList<Integer>();
        ArrayList<Integer> daftarMakan = new ArrayList<Integer>();
        ArrayList<Integer> daftarFasilitas = new ArrayList<Integer>();

        //Memanggil scanner dengan nama in
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine(); 
        System.out.print("Masukkan nomor KTP : ");
        String noKTP = in.nextLine();
        System.out.print("Masukkan nomor Telepon : ");
        String noTelp = in.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat = in.nextLine();
        System.out.println();
        System.out.println("1. Non-Member");
        System.out.println("2. Member");
        System.out.println("3. Member Premium");
        System.out.print("Masukkan jenis membership : ");
        byte pilMember = in.nextByte();

        System.out.println();
        System.out.println("1. Weekend");
        System.out.println("2. Hari Kerja");
        System.out.print("Masukkan hari saat pemesanan : ");
        int temps = in.nextByte();
        if (temps == 1) isWeekend = true;
        else isWeekend = false;

        System.out.println();
        byte jumKamar;
        while (true) {
            System.out.print("Masukkan jumlah kamar yang ingin dipesan : ");
            jumKamar = in.nextByte();
            if ((pilMember == 1) && (jumKamar > 3)){
                System.out.println("Jumlah kamar yang maksimal dapat dipesan oleh pelanggan Non member adalah 3");
            } else if ((pilMember == 2) && (jumKamar > 5)){
                System.out.println("Jumlah kamar yang maksimal dapat dipesan oleh pelanggan Non member adalah 5");
            } else break;
        }

        System.out.println("Jenis kamar");
        System.out.println("1. Single");
        System.out.println("2. Double");
        System.out.println("3. Suite");
        for (int i = 1;i<=jumKamar;i++){
            System.out.printf("Jenis kamar %d : ",i);
            temps = in.nextByte();
            daftarKamar.add(temps);
        }

        System.out.println();
        temps = 0;
        System.out.print("Masukkan penggunaan breakfast : ");
        temps = in.nextByte();
        daftarMakan.add(temps);
        System.out.print("Masukkan penggunaan lunch : ");
        temps = in.nextByte();
        daftarMakan.add(temps);
        System.out.print("Masukkan penggunaan dinner : ");
        temps = in.nextByte();
        daftarMakan.add(temps);

        System.out.println();
        temps = 0;
        System.out.print("Masukkan penggunaan kolam renang : ");
        temps = in.nextByte();
        daftarFasilitas.add(temps);
        System.out.print("Masukkan penggunaan sauna : ");
        temps = in.nextByte();
        daftarFasilitas.add(temps);
        System.out.print("Masukkan penggunaan spa : ");
        temps = in.nextByte();
        daftarFasilitas.add(temps);
        
        if (pilMember == 1){
            Pelanggan a = new Non_member(nama, noKTP, noTelp, alamat, isWeekend, daftarKamar, daftarMakan, daftarFasilitas); 
            a.printAll();
        } else if (pilMember == 2){
            Pelanggan a = new Member(nama, noKTP, noTelp, alamat, isWeekend, daftarKamar, daftarMakan, daftarFasilitas);
            a.printAll();
        } else {
            Pelanggan a = new Premium(nama, noKTP, noTelp, alamat, isWeekend, daftarKamar, daftarMakan, daftarFasilitas);
            a.printAll();
        }

        ///Menutup Scanner
        in.close();
    }
}