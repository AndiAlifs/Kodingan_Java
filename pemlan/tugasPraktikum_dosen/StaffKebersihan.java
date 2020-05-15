
public class StaffKebersihan extends Pegawai{
    private int poin;

    public StaffKebersihan(String nama, String nIP, String alamat,int poin) {
        super(nama, nIP, alamat);
        setJabatan("Staff Kebersihan");
        setGajiTambahan(poin*25000);
        this.poin = poin;
    }

    @Override
    public String toString() {
        System.out.printf("%-18s : %s%n","Nama",getNama());
        System.out.printf("%-18s : %s%n","NIP",getNIP());
        System.out.printf("%-18s : %s%n","Alamat",getAlamat());
        System.out.printf("%-18s : %s%n","Jabatan",getJabatan());
        System.out.printf("%-18s : %d%n","Jumlah Poin",this.poin);
        System.out.printf("%-18s : Rp.%d%n","Gaji",getGaji());
        return "";
    }
 
}