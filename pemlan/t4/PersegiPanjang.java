package id.filkom.nim_195150401111048;

public class PersegiPanjang extends BidangDatar{
    public PersegiPanjang(int panjang,int lebar){
        super(panjang,lebar);
    }

    public float getLuas(){
        float temp=panjang*lebar;
        return temp;
    }
}