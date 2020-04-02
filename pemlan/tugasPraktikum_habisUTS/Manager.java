public class Manager extends Pegawai{
    public Manager(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga,
            int jumlahAnak) {
        super(nama, noIndukPegawai, tahunMasuk, gajiPokok, keluarga, jumlahAnak);
    }
    
    @Override
    public void printAll() {
		System.out.println("Gaji pokok : Rp."+getGajiPokok());
        System.out.println("Bonus : Rp."+getBonus());
        System.out.println("Tunjangan : Rp."+getTunjangan());
        System.out.println("Tunjangan Jabatan : Rp."+(getTotalGaji()*0.1));
		System.out.println("Total Gaji : Rp."+(getTotalGaji()+(getTotalGaji()*0.1)));
    } 
}