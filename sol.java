
import java.util.*;
// package id.filkom.nim_195150401111048;

class BidangDatar{
    private String nama;
    private int panjang;
    private int lebar;

    public BidangDatar(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public float getLuas(){
        float temp=this.panjang*this.lebar;
        return temp;
    }
}

class Segitiga extends BidangDatar{
    public Segitiga(int panjang,int lebar){
        super(panjang,lebar);
    }

    @Override
    public float getLuas(){
        float temp=0.5f*getPanjang()*getLebar();
        return temp;
    }
}

public class sol{
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
    }
}
