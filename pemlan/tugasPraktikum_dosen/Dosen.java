
public class Dosen extends Pegawai{
    private int sks;

    public Dosen(String nama, String nIP, String alamat,int sks) {
        super(nama, nIP, alamat);
        setJabatan(("Dosen"));
        setGajiTambahan(sks*100000);
        this.sks = sks;
    }

    @Override
    public String toString() {
        System.out.printf("%-18s : %s%n","Nama",getNama());
        System.out.printf("%-18s : %s%n","NIP",getNIP());
        System.out.printf("%-18s : %s%n","Alamat",getAlamat());
        System.out.printf("%-18s : %s%n","Jabatan",getJabatan());
        System.out.printf("%-18s : %s SKS%n","Jumlah SKS",sks);
        System.out.printf("%-18s : Rp.%d%n","Gaji",getGaji());
        System.out.printf("%-18s : Rp.%d%n","Gaji Sertifikasi",getGajiSertifikasi());
        return "";
    }
}