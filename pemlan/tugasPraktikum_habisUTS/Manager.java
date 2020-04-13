//kelas Manager inherit dari kelas Pegawai
public class Manager extends Pegawai{
    //konstruktor dengan mengisi attribut nama, noInduk oegawan, tahun masuk, gaji pokok, berkeluarga, dan jumlah anak
    public Manager(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga,
            int jumlahAnak) {
        //konstruktor ke kelas induk
        super(nama, noIndukPegawai, tahunMasuk, gajiPokok, keluarga, jumlahAnak);
    }

    //Override method printAll. Mencetak attribut gaji pokok, Bonus, tunjangan, tunjangan jabatan, dan total gaji
    @Override
    public void printAll() {
		System.out.println("Gaji pokok : Rp."+getGajiPokok());
        System.out.println("Bonus : Rp."+getBonus());
        System.out.println("Tunjangan : Rp."+getTunjangan());
        System.out.println("Tunjangan Jabatan : Rp."+(getTotalGaji()*0.1));
		System.out.printf("Total Gaji : Rp.%.1f%n",(getTotalGaji()+(getTotalGaji()*0.1)));
    }
}
