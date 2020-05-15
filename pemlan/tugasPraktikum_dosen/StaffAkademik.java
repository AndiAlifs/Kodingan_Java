
public class StaffAkademik extends Pegawai{
    private int harker;

    public StaffAkademik(String nama, String nIP, String alamat, int harKer) {
        super(nama, nIP, alamat);
        setJabatan("Staff Akademik");
        harker = harKer;
        if(harKer>20) setGajiTambahan(50000*(harKer-20));
    }
    
    @Override
    public String toString() {
        System.out.printf("%-18s : %s%n","Nama",getNama());
        System.out.printf("%-18s : %s%n","NIP",getNIP());
        System.out.printf("%-18s : %s%n","Alamat",getAlamat());
        System.out.printf("%-18s : %s%n","Jabatan",getJabatan());
        System.out.printf("%-18s : %s Hari%n","Jumlah Hari Kerja",harker);
        System.out.printf("%-18s : Rp.%d%n","Gaji",getGaji());
        System.out.printf("%-18s : Rp.%d%n","Gaji Sertifikasi",getGajiSertifikasi());
        return "";
    }
}