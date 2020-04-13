//kelas Programmer inherit dari kelas Pegawai
public class Programmer extends Pegawai {
    //deklarasi attribut jam kerja
    private int jamKerja;

    //conditional apabila jam kerja lebih dari 10 jam diberi bonus
    public double getBonusLembur() {
        double temp = 0;
        if (jamKerja > 10) {
            temp = 0.05 * getGajiPokok() * (jamKerja - 10);
        }
        return temp;
    }

    //konstruktor dengan mengisi attribut nama, noInduk oegawan, tahun masuk, gaji pokok, berkeluarga, jumlah anak, dan jam kerja
    public Programmer(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga,
            int jumlahAnak, int jamKerja) {
        //konstruktor ke kelas induk
        super(nama, noIndukPegawai, tahunMasuk, gajiPokok, keluarga, jumlahAnak);
        this.jamKerja = jamKerja;
    }

    //Override method printAll. Mencetak attribut gaji pokok, Bonus, bonus lembur, tunjangan, dan total gaji    
    @Override
    public void printAll() {
		System.out.println("Gaji pokok : Rp."+getGajiPokok());
        System.out.println("Bonus : Rp."+getBonus());
        System.out.println("Bonus lembur : Rp."+getBonusLembur());
		System.out.println("Tunjangan : Rp."+getTunjangan());
		System.out.println("Total Gaji : Rp."+(getTotalGaji()+getBonusLembur()));
    }
}
