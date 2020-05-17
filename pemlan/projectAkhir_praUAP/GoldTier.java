public class GoldTier extends Pelanggan implements MethodInterface {

    public GoldTier(String nama, int jarak, int poin) {
        super(nama, jarak, poin);
        tier = "Gold Tier";
        poinNew = getPoinTambahan(this.poin, this.jarak);
        ongkos = getHarga(jarak);
        printAll();

    }
    
    @Override
    public int getHarga(int perjalanan) {
        int harga = 10000;
        if (perjalanan > 2) {
            harga += 2500 * (perjalanan - 2);
        }
        return harga;
    }

    @Override
    public int getPoinTambahan(int poinS, int perjalanan) {
        int temp = perjalanan*25;
        if (perjalanan>5){
            temp += (temp*0.1)*perjalanan; 
        }
        return temp;
    }

}