import java.util.*;

public abstract class Pelanggan{
    //deklarasi attribute yang ada pada setiap pelanggan
    private String nama;
    private String noKTP;
    private String noTelp;
    private String alamat;
    private String jenisMember;
    private ArrayList<String> daftarKamar = new ArrayList<String>();
    private ArrayList<Integer> hargaKamar = new ArrayList<Integer>();
    private boolean isWeekend; 
    private int jumlahMaxKamar=0;
    private int jumlahKamar;
    private long totalKamar;
    private long diskonMember;
    private long totalBiayaKamar;
    private ArrayList<Integer> voucherFasilitas = new ArrayList<Integer>();
    private ArrayList<Integer> jumlahFasilitas = new ArrayList<Integer>();
    private ArrayList<Integer> lebihFasilitas = new ArrayList<Integer>();
    private ArrayList<Integer> biayaFasilitas = new ArrayList<Integer>();
    private long totalFasilitas;
    private ArrayList<Integer> voucherMakanan = new ArrayList<Integer>();
    private ArrayList<Integer> jumlahMakanan = new ArrayList<Integer>();
    private ArrayList<Integer> lebihMakanan = new ArrayList<Integer>();
    private ArrayList<Integer> biayaMakanan = new ArrayList<Integer>();
    private long totalMakanan;
    private long totalBiaya;

    public Pelanggan(String nama, String noKTP, String noTelp, String Alamat,boolean isWeekend, ArrayList<Integer> daftarKamar, ArrayList<Integer> daftarMakan, ArrayList<Integer> daftarFasilitas){
        this.nama = nama;
        this.noKTP = noKTP;
        this.noTelp = noTelp;
        this.alamat = Alamat;
        this.isWeekend = isWeekend;
        this.jumlahKamar = daftarKamar.size();
        for (int i = 0;i<daftarKamar.size();i++){
            tambahDaftarKamar(daftarKamar.get(i));
        }
        setTotalBiayaKamar();
        this.jumlahMakanan = daftarMakan;
        this.jumlahFasilitas = daftarFasilitas;
        
    }

    public void updateMakanDanFasilitas(){
        tambahBiayaMakan();
        tambahBiayaFasilitas();
        cekLebihMakan();
        cekLebihFasilitas();
        setTotalFasilitas();
        setTotalMakanan();
    }

    public void cekLebihMakan(){
        for (int i=0;i<3;i++){
            int kali = 0;
            if (voucherMakanan.get(i) < jumlahMakanan.get(i)){
                kali = jumlahMakanan.get(i) - voucherMakanan.get(i);
                lebihMakanan.add(kali);
            } else lebihMakanan.add(0);
        }
    }

    public void cekLebihFasilitas(){
        for (int i=0;i<3;i++){
            int kali = 0;
            if (voucherFasilitas.get(i) < jumlahFasilitas.get(i)){
                kali = jumlahFasilitas.get(i) - voucherFasilitas.get(i);
                lebihFasilitas.add(kali);
            } else lebihFasilitas.add(0);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setJumlahMaxKamar(int x) {
        this.jumlahMaxKamar = x;
    }

    public int getJumlahMaxKamar() {
        return this.jumlahMaxKamar;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisMember() {
        return jenisMember;
    }

    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public long getTotalKamar() {
        return totalKamar;
    }

    public void setTotalKamar(long totalKamar) {
        this.totalKamar = totalKamar;
    }

    public abstract void aturVocerMakan(ArrayList<Integer> daftarKamar);

    public abstract void aturVocerFasilitas(ArrayList<Integer> daftarKamar);

    public abstract void aturDiskon();

    public long getDiskonMember() {
        return diskonMember;
    }

    public void setDiskonMember(long diskonMember) {
        this.diskonMember = diskonMember;
    }

    public long getTotalBiayaKamar() {
        return totalBiayaKamar;
    }

    public void setTotalBiayaKamar() {
        long temp = 0;
        for (int i = 0;i<jumlahKamar;i++){
            temp += hargaKamar.get(i);
        };
        this.totalBiayaKamar = temp;
    }

    public long getTotalFasilitas() {
        return totalFasilitas;
    }

    public void setTotalFasilitas() {
        long temp = 0;
        for (int i = 0;i<3;i++){
            temp += lebihFasilitas.get(i)*biayaFasilitas.get(i);
        };
        this.totalFasilitas = temp;
    }

    public long getTotalMakanan() {
        return totalMakanan;
    }

    public void setTotalMakanan() {
        long temp = 0;
        for (int i = 0;i<3;i++){
            temp += lebihMakanan.get(i)*biayaMakanan.get(i);
        };
        this.totalMakanan = temp;
    }

    public long getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya() {
        long temp = (getTotalBiayaKamar() - getDiskonMember()) + getTotalKamar() + getTotalMakanan();
        this.totalBiaya = temp;
    }

    public void setWeekend(boolean x){
        this.isWeekend = x;
    }

    public boolean isWeekend(){
        return isWeekend;
    }

    public void tambahDaftarKamar(int i){
        if (!isWeekend){
            if (i == 1){
                daftarKamar.add("Single");
                hargaKamar.add(200000);
            } else if (i == 2){
                daftarKamar.add("Double");
                hargaKamar.add(375000);
            } else if (i == 3){
                daftarKamar.add("Suite");
                hargaKamar.add(750000);
            }
        } else {
            if (i == 1){
                daftarKamar.add("Single");
                hargaKamar.add(250000);
            } else if (i == 2){
                daftarKamar.add("Double");
                hargaKamar.add(450000);
            } else if (i == 3){
                daftarKamar.add("Suite");
                hargaKamar.add(800000);
            }
        }
    }

    public void tambahVocerMakan(int x){
        voucherMakanan.add(x);
    }

    public void tambahMakan(int x){
        jumlahMakanan.add(x);
    }

    public void tambahBiayaMakan(){
        biayaMakanan.add(25000);
        biayaMakanan.add(25000);
        biayaMakanan.add(30000);
    }

    public void tambahVocerFasilitas(int x){
        voucherFasilitas.add(x);
    }

    public void tambahFasilitas(int x){
        jumlahFasilitas.add(x);
    }

    public void tambahBiayaFasilitas(){
        biayaFasilitas.add(25000);
        biayaFasilitas.add(15000);
        biayaFasilitas.add(15000);
    }

    public void printAll(){
        System.out.println("==========NOTA PEMESANAN HOTEL========");
        System.out.printf("%-15s : %s%n","Nama",getNama());
        System.out.printf("%-15s : %s%n","Nomor KTP",getNoKTP());
        System.out.printf("%-15s : %s%n","Nomor Telepon",getNoTelp());
        System.out.printf("%-15s : %s%n","Alamat",getAlamat());
        System.out.printf("%-15s : %s%n","Jenis Member",getJenisMember());
        System.out.println();
        if (getJenisMember().equals("Member Premium")){
            System.out.printf("Jumlah pesan kamar (Tidak Dibatasi) : %d%n",jumlahKamar);
        } else {
            System.out.printf("Jumlah pesan kamar (%d Kamar) : %d%n",getJumlahMaxKamar(),jumlahKamar);
        }
        String hari;
        if (isWeekend)  hari = "Weekend";
        else hari = "Hari Kerja";
        for (int i=0;i<jumlahKamar;i++){
            System.out.printf("%d. %s %s: %d%n",i+1,daftarKamar.get(i),hari,hargaKamar.get(i));
        }
        System.out.printf("%-15s : %s%n","Total",getTotalBiayaKamar());
        System.out.printf("%-15s : %s%n","Diskon Member",getDiskonMember());
        long kamarBersih = getTotalBiayaKamar() - getDiskonMember();
        System.out.printf("%-15s : %s%n","Biaya Kamar",kamarBersih);
        System.out.println();
        System.out.println("Fasilitas Diperoleh : ");
        System.out.printf("1. Kolam Renang: %d (Free)%n",voucherFasilitas.get(0));
        System.out.printf("2. Sauna: %d (Free)%n",voucherFasilitas.get(1));
        System.out.printf("3. Spa: %d (Free)%n",voucherFasilitas.get(2));
        System.out.println();
        System.out.println("Tambahan Pesan Fasilitas : ");
        if (getTotalFasilitas() == 0) System.out.println("Tidak ada");
        if (lebihFasilitas.get(0) > 0) System.out.printf("1. Kolam Renang %d x %d= %d %n",lebihFasilitas.get(0),biayaFasilitas.get(0),lebihFasilitas.get(0)*biayaFasilitas.get(0));
        if (lebihFasilitas.get(1) > 0) System.out.printf("2. Sauna %d x %d= %d %n",lebihFasilitas.get(1),biayaFasilitas.get(1),lebihFasilitas.get(1)*biayaFasilitas.get(1)); 
        if (lebihFasilitas.get(2) > 0) System.out.printf("3. Spa %d x %d= %d %n",lebihFasilitas.get(2),biayaFasilitas.get(2),lebihFasilitas.get(2)*biayaFasilitas.get(2));
        System.out.println();
        System.out.println("Voucher Makan Diperoleh : ");
        System.out.printf("1. Breakfast: %d (Free)%n",voucherMakanan.get(0));
        System.out.printf("2. Lunch: %d (Free)%n",voucherMakanan.get(1));
        System.out.printf("3. Dinner: %d (Free)%n",voucherMakanan.get(2));
        System.out.println();
        System.out.println("Tambahan Pesan Makan : ");
        if (getTotalMakanan() == 0) System.out.println("Tidak ada");
        byte j = 1;
        if (lebihMakanan.get(0) > 0) System.out.printf("1. Breakfast %d x %d= %d %n",lebihMakanan.get(0),biayaMakanan.get(0),lebihMakanan.get(0)*biayaMakanan.get(0));
        if (lebihMakanan.get(1) > 0) System.out.printf("2. Lunch %d x %d= %d %n",lebihMakanan.get(1),biayaMakanan.get(1),lebihMakanan.get(1)*biayaMakanan.get(1)); 
        if (lebihMakanan.get(2) > 0) System.out.printf("3. Dinner %d x %d= %d %n",lebihMakanan.get(2),biayaMakanan.get(2),lebihMakanan.get(2)*biayaMakanan.get(2));
        System.out.println();
        setTotalBiaya();
        System.out.printf("Total yang harus dibayarkan: %d%n",getTotalBiaya());

    }
}