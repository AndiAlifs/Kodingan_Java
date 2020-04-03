public class Sales extends Pegawai {
    private double hargaBarang;
    private int stockBarang;
    private int barangTerjual;
    public double getBonusTambahan(){
        double temp = 0;
        if ((1.00*barangTerjual / stockBarang) > 0.8){
            temp = 0.15 * hargaBarang * barangTerjual;
        } else {
            temp = 0.03 * hargaBarang * barangTerjual;
        }
        return temp;
    }

    public Sales(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga, int jumlahAnak, double hargaBarang, int stockBarang, int barangTerjual) {
        super(nama, noIndukPegawai, tahunMasuk, gajiPokok, keluarga, jumlahAnak);
        this.hargaBarang = hargaBarang;
        this.stockBarang = stockBarang;
        this.barangTerjual = barangTerjual;
    }

    @Override
    public void printAll() {
		System.out.println("Gaji pokok : Rp."+getGajiPokok());
        System.out.println("Bonus : Rp."+getBonus());
        System.out.println("Bonus Penjualan : Rp."+getBonusTambahan());
		System.out.println("Tunjangan : Rp."+getTunjangan());
		System.out.println("Total Gaji : Rp."+(getTotalGaji()+getBonusTambahan()));
    }
}