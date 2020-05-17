public class BronzeTier extends Pelanggan implements MethodInterface {

    public BronzeTier(String nama, int jarak, int poin) {
        super(nama, jarak, poin);
        tier = "Bronze Tier";
        poinNew = getPoinTambahan(this.poin, this.jarak);
        ongkos = getHarga(jarak);
        printAll();
    }
    
    @Override
    public int getHarga(final int perjalanan) {
        int harga = 10000;
        if (perjalanan > 2) {
            harga += 3000 * (perjalanan - 2);
        }
        return harga;
    }

    @Override
    public int getPoinTambahan(int poinS, int perjalanan) {
        int temp = perjalanan*15;
        return temp;
    }
}