import java.time.LocalDate;

public class Pegawai {
    private String nama;
    private String noIndukPegawai;
    private LocalDate tahunMasuk;
    private double gajiPokok;
    private boolean keluarga;
	private int jumlahAnak;
	
	public Pegawai(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga, int jumlahAnak) {
		this.nama = nama;
		this.noIndukPegawai = noIndukPegawai;
		this.tahunMasuk = LocalDate.of(tahunMasuk,1,1);
		this.gajiPokok = gajiPokok;
		this.keluarga = keluarga;
		this.jumlahAnak = jumlahAnak;
	}

    public double getGajiPokok(){
        return this.gajiPokok;
	}
	
    public double getBonus(){
		double temp=0;
		int lamaKerja = getTahunNow() - getTahunMasuk();
		if (lamaKerja >= 1 && lamaKerja <= 5 ){
			temp = gajiPokok *lamaKerja * 0.1; 
		} else if(lamaKerja>5){
			temp = gajiPokok *lamaKerja * 0.15; 
		}
        return temp;
    }
    public double getTunjangan(){
		double temp=0;
		if (keluarga){
			temp = 0.1*gajiPokok;
			if(jumlahAnak>0){
				if(jumlahAnak>3) jumlahAnak = 3;
				temp += 0.1*gajiPokok*jumlahAnak;
			}
		}
        return temp;
    }
    public double getTotalGaji(){
		double temp = gajiPokok + getBonus() +getTunjangan();
        return temp;
    }
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNoIndukPegawai() {
		return noIndukPegawai;
	}
	public void setNoIndukPegawai(String noIndukPegawai) {
		this.noIndukPegawai = noIndukPegawai;
	}

	public int getTahunMasuk() {
		return tahunMasuk.getYear();
	}

	public int getTahunNow() {
		LocalDate today = LocalDate.now();
		return today.getYear();
	}

	public boolean isKeluarga() {
		return keluarga;
	}

	public int getJumlahAnak() {
		return jumlahAnak;
	}

	public void printAll(){
		System.out.println("Gaji pokok : Rp."+gajiPokok);
		System.out.printf("%s%.1f%n","Bonus : Rp.",getBonus());
		System.out.println("Tunjangan : Rp."+getTunjangan());
		System.out.printf("Total Gaji : Rp.%.1f%n",getTotalGaji());
	}
}