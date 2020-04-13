//kelas Sales inherit dari kelas Pegawai
public class Sales extends Pegawai {
    //deklarasi attribut kelas sales
    private double hargaBarang;
    private int stockBarang;
    private int barangTerjual;

    //conditional jika barangTerjual lebih dari 80% bonus 15%, jika tidak bonus 3%
    public double getBonusTambahan(){
        double temp = 0;
        if ((1.00*barangTerjual / stockBarang) > 0.8){
            temp = 0.15 * hargaBarang * barangTerjual;
        } else {
            temp = 0.03 * hargaBarang * barangTerjual;
        }
        return temp;
    }

    //konstruktor dengan mengisi attribut nama, noInduk oegawan, tahun masuk, gaji pokok, berkeluarga, jumlah anak, harga barang, stok barang, dan barang terjual
    public Sales(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga, int jumlahAnak, double hargaBarang, int stockBarang, int barangTerjual) {
        //konstruktor ke kelas induk
        super(nama, noIndukPegawai, tahunMasuk, gajiPokok, keluarga, jumlahAnak);
        this.hargaBarang = hargaBarang;
        this.stockBarang = stockBarang;
        this.barangTerjual = barangTerjual;
    }

    //Override method printAll. Mencetak attribut gaji pokok, Bonus, Bonus Penjualan, tunjangan, dan total gaji
    @Override
    public void printAll() {
		System.out.println("Gaji pokok : Rp."+getGajiPokok());
        System.out.println("Bonus : Rp."+getBonus());
        System.out.println("Bonus Penjualan : Rp."+getBonusTambahan());
		System.out.println("Tunjangan : Rp."+getTunjangan());
		System.out.println("Total Gaji : Rp."+(getTotalGaji()+getBonusTambahan()));
    }
}
