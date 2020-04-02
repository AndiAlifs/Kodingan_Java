package id.filkom.nim_195150401111048;

public class BidangDatar{
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