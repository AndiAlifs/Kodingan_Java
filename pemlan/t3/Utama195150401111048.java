package id.filkom.nim_195150401111048;

import java.util.*;

public class Utama195150401111048{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jenis : ");
        String nama = in.nextLine();
        System.out.print("Masukkan panjang : ");
        int pnjg = in.nextInt();
        System.out.print("Masukkan lebar : ");
        int lbr = in.nextInt();
        if(nama.equalsIgnoreCase("segitiga")){
            Segitiga a = new Segitiga(pnjg,lbr);
            System.out.printf("Luas %s : %.2f",nama,a.getLuas());
        } else {
            BidangDatar a = new BidangDatar(pnjg,lbr);
            System.out.printf("Luas %s : %.2f",nama,a.getLuas());
        }
        in.close();
    }
}