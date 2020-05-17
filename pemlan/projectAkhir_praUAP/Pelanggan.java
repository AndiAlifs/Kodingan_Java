public abstract class Pelanggan {
    String nama;
    String tier;
    int jarak;
    int ongkos;
    int poinNew;
    int poin;

    public Pelanggan(String nama, int jarak, int poin) {
        this.nama = nama;
        this.jarak = jarak;
        this.poin = poin;
    }

    public void printAll(){
        poin+=poinNew;
        System.out.printf("%-20s : %s%n","Nama",this.nama);
        System.out.printf("%-20s : %s%n","Tier Pelanggan",this.tier);
        System.out.printf("%-20s : %dkm%n","Jarak yang ditempuh",this.jarak);
        System.out.printf("%-20s : Rp. %d%n","Total Biaya",this.ongkos);
        System.out.printf("%-20s : %d(+%d)%n","Poin Saat Ini",poin,poinNew);
    }

}