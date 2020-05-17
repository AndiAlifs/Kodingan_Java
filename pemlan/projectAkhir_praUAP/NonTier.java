public class NonTier extends Pelanggan implements MethodInterface {

    public NonTier(String nama, int jarak, int poin) {
        super(nama, jarak, poin);
        tier = "Non Tier";
        poinNew = getPoinTambahan(this.poin, this.jarak);
        ongkos = getHarga(jarak);
        printAll();
    }

    @Override
    public int getHarga(final int perjalanan) {
        int harga = 10000;
        if (perjalanan > 2) {
            harga += 3500 * (perjalanan - 2);
        }
        return harga;
    }

    @Override
    public int getPoinTambahan(int poinS, int perjalanan) {
        int temp = perjalanan*10;
        return temp;
    }
    
}