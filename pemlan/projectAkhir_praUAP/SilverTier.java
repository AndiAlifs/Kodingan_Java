public class SilverTier implements Pelanggan{

    public SilverTier(String nama, int poin, int perjalanan) {
        System.out.printf("%-20s : %s%n","Nama",nama);
        System.out.printf("%-20s : Silver Tier%n","Tier Pelanggan");
        System.out.printf("%-20s : %dkm%n","Jarak yang ditempuh",perjalanan);
        System.out.printf("%-20s : Rp. %d%n","Total Biaya",getHarga(perjalanan));
        System.out.printf("%-20s : %d(+%d)%n","Poin Saat Ini",poin+getPoinTambahan(poin,perjalanan),getPoinTambahan(poin,perjalanan));
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