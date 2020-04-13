//import library LocalDate untuk data tipe Date
import java.time.LocalDate;

//kelas induk
public class Pegawai {
    //deklarasi attribut kelas pegawai
    private String nama;
    private String noIndukPegawai;
    private LocalDate tahunMasuk;
    private double gajiPokok;
    private boolean keluarga;
	private int jumlahAnak;

    //konstruktor dengan mengisi attribut nama, noInduk oegawan, tahun masuk, gaji pokok, berkeluarga, dan jumlah anak
	public Pegawai(String nama, String noIndukPegawai, int tahunMasuk, double gajiPokok, boolean keluarga, int jumlahAnak) {
		this.nama = nama;
		this.noIndukPegawai = noIndukPegawai;
		this.tahunMasuk = LocalDate.of(tahunMasuk,1,1);
		this.gajiPokok = gajiPokok;
		this.keluarga = keluarga;
		this.jumlahAnak = jumlahAnak;
	}

    //getter gaji pokok
    public double getGajiPokok(){
        return this.gajiPokok;
	}

    //getter Bonus setelah dikalkulasi sesuai dengan lama kerja
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

    //getter tunjangan setelah dikalkulasi sesuai dengan berkeluarga dan jumlah anak
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

    //getter total gaji
    public double getTotalGaji(){
		double temp = gajiPokok + getBonus() +getTunjangan();
        return temp;
    }

    //getter attribut nama
	public String getNama() {
		return nama;
	}

    //getter no.induk pegawai
	public String getNoIndukPegawai() {
		return noIndukPegawai;
	}

    //getter tahun masuk, dikembalikan dalam bentuk int dari tipe data Date
	public int getTahunMasuk() {
		return tahunMasuk.getYear();
	}

    //getter tahun sekarang, dikembalikan dalam bentuk int dari tipe data Date
	public int getTahunNow() {
		LocalDate today = LocalDate.now();
		return today.getYear();
	}

    //getter keluarga
	public boolean isKeluarga() {
		return keluarga;
	}

    //getter jumlah anak
	public int getJumlahAnak() {
		return jumlahAnak;
	}

    //mencetak attribut gaji pokok, Bonus, tunjangan, dan total gaji
	public void printAll(){
		System.out.println("Gaji pokok : Rp."+gajiPokok);
		System.out.printf("%s%.1f%n","Bonus : Rp.",getBonus());
		System.out.println("Tunjangan : Rp."+getTunjangan());
		System.out.printf("Total Gaji : Rp.%.1f%n",getTotalGaji());
	}
}
