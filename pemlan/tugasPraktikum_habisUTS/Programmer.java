
public class Programmer extends Pegawai {
    private int jamKerja;

    public double getBonusLembur() {
        double temp = 0;
        if (jamKerja > 10) {
            temp = 0.05 * getGajiPokok() * (jamKerja - 10);
        }
        return temp;
    }

    public Programmer(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga,
            int jumlahAnak, int jamKerja) {
        super(nama, noIndukPegawai, tahunMasuk, gajiPokok, keluarga, jumlahAnak);
        this.jamKerja = jamKerja;
    }

    @Override
    public void printAll() {
		System.out.println("Gaji pokok : Rp."+getGajiPokok());
        System.out.println("Bonus : Rp."+getBonus());
        System.out.println("Bonus lembur : Rp."+getBonusLembur());
		System.out.println("Tunjangan : Rp."+getTunjangan());
		System.out.println("Total Gaji : Rp."+(getTotalGaji()+getBonusLembur()));
    }
}