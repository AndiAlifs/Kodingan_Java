public class GoldTier implements Pelanggan{

    public GoldTier(String nama, int poin, int perjalanan) {
        System.out.printf("%-20s : %s%n","Nama",nama);
        System.out.printf("%-20s : Gold Tier%n","Tier Pelanggan");
        System.out.printf("%-20s : %dkm%n","Jarak yang ditempuh",perjalanan);
        System.out.printf("%-20s : Rp. %d%n","Total Biaya",getHarga(perjalanan));
        System.out.printf("%-20s : %d(+%d)%n","Poin Saat Ini",poin+getPoinTambahan(poin,perjalanan),getPoinTambahan(poin,perjalanan));
    }
    
    @Override
    public int getHarga(final int perjalanan) {
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