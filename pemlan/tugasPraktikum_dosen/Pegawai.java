
public abstract class Pegawai {
    private String nama;
    private String NIP;
    private String alamat;
    private String jabatan;
    private int gajiDasar = 2000000;
    private int gajiTambahan = 0;
    private int gajiSertifikasi = 0;

    public Pegawai(String nama, String nIP, String alamat) {
        this.nama = nama;
        NIP = nIP;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void sertifikasi(){
        setGajiSertifikasi(2000000);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String nIP) {
        NIP = nIP;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gajiDasar + gajiTambahan;
    }

    public int getGajiTambahan() {
        return gajiTambahan;
    }

    public void setGajiTambahan(int gajiTambahan) {
        this.gajiTambahan = gajiTambahan;
    }

    public int getGajiSertifikasi() {
        return gajiSertifikasi;
    }

    public void setGajiSertifikasi(int gajiSertifikasi) {
        this.gajiSertifikasi = gajiSertifikasi;
    }

    public void printTanpaGaji(){
        System.out.printf("%-18s : %s%n","Nama",nama);
        System.out.printf("%-18s : %s%n","NIP",NIP);
        System.out.printf("%-18s : %s%n","Alamat",alamat);
        System.out.printf("%-18s : %s%n","Jabatan",jabatan);
    }


    @Override
    public String toString() {
        return "";
    }

    

}