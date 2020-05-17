public class SilverTier extends Pelanggan implements MethodInterface {

    public SilverTier(String nama, int jarak, int poin) {
        super(nama, jarak, poin);
        tier = "Silver Tier";
        poinNew = getPoinTambahan(this.poin, this.jarak);
        ongkos = getHarga(jarak);
        printAll();
    }
    
    @Override
    public int getHarga(final int perjalanan) {
        int harga = 10000;
        if (perjalanan > 2) {
            harga += 2800 * (perjalanan - 2);
        }
        return harga;
    }

    @Override
    public int getPoinTambahan(int poinS, int perjalanan) {
        int temp = perjalanan*15;
        if (perjalanan>5){
            temp += (temp*0.05)*perjalanan; 
        }
        return temp;
    }
}