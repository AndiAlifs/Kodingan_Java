package id.filkom.nim_195150401111048;

public abstract class BidangDatar{
    public String nama;
    public int panjang;
    public int lebar;

    public BidangDatar(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public abstract float getLuas();
}