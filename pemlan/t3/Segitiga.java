package id.filkom.nim_195150401111048;

public class Segitiga extends BidangDatar{
    public Segitiga(int panjang,int lebar){
        super(panjang,lebar);
    }

    @Override
    public float getLuas(){
        float temp=0.5f*getPanjang()*getLebar();
        return temp;
    }
}