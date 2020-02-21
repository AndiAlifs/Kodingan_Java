import java.util.*;

class Buku1{
    public String[] judul_b = new String[10];
    public String[] penulis_b = new String[10];
    public String[] penerbit_b = new String[10];
    public long[] tTerbit_b = new long[10];
    public String[] kTerbit_b = new String[10];
    public long[] hargaStat_b = new long[10];
    public double[] diskon_b = new double[10];
    public String[] discon_b = new String[10];
    public String[] kategori_b = new String[10];
    public long[] hargaAsli_b =new long[judul_b.length];
    public int[] stok_b = new int[10];



    public void setAll(int n,int x){
        this.judul_b[x] = Solution.judul[n];
        this.penulis_b[x] = Solution.penulis[n];
        this.hargaStat_b[x] = Solution.hargaStat[n];
        this.diskon_b[x] = Solution.diskon[n];
        this.kategori_b[x] = Solution.kategori[n];
        this.hargaAsli_b[x] = setHargaAsli(this.hargaStat_b[x],this.diskon_b[x]);
        this.stok_b[x] = Solution.stok[n];
    }


    public Buku1(String s){
        int j=0;
        for (int i=0;i<15;i++){
            if (tugasOOP1.penulis[i].equals(s)){
                setAll(i,j);
                j++;
            }
        }
        for (int i=0;i<15;i++){
            if (tugasOOP1.kategori[i].equals(s)){
                setAll(i,j);
                j++;
            }
        }
        for (int i=0;i<15;i++){
            if (tugasOOP1.judul[i].equals(s)){
                setAll(i,j);
                j++;
            }
        }
    }

    public long setHargaAsli(long h,double d){
        double temp = h*d;
        long temp1 = h - (long)temp;
        return temp1;
    }


    public void printAll(){
        for (int i=0; i<=10;i++) {
            if(this.stok_b[i]==0) break;
            System.out.printf("%-12s :%s%n","Judul Buku",this.judul_b[i]);
            System.out.printf("%-12s :%s%d%n","Harga Bersih","Rp.",this.hargaAsli_b[i]);
            System.out.printf("%-12s :%d%n%n","Stok",this.stok_b[i]);
        }
    }
}

//class utama
public class Solution{
    //Deklarasi seluruh data
    public static String[] judul= {"Konfigurasi Wireless Routerboard Mikrotik","Instalasi & konfigurasi Jaringan Windows & Linux","Cepat Kuasai PHP dan MySQL","Pengantar Ilmu Sejarah","Runtuhnya Kerajaan Hindu-Jawa","Pemberontakan Indonesia Pada Masa Pendudukan Jeang","Filsafat Manusia","Pengantar Ilmu Filsafat","Filsafat Islam","Pemikiran dan Aktualisasi Pengembangan Pendidikan Islam" ,"Fiqih Sunnah","Ringkasan Shahih Muslim","Dasar - Dasar Ilmu Politik","Sistem Politik Indonesia","Memahami Ilmu Politik"};
    public static String[] penulis = {"Hardana","Bunafit Nugroho","Andreas","Kuntowijoyo","Slamet ","Akira Nagazumi dan Nasution","Abidin dan Zainal","Achmadi Asmoro","Al-Ghazali","Prof. Dr. H. Muhaimin","Imam Hasan Al-Banna","Abu Ahmadi","Miriam Budiarjo","PT Gramedia Pustaka Utama","Robert Michels"};
    public static String[] penerbit = {"Andy","Andy","Andy","Bentang Budaya","Bentang Budaya","Bentang Budaya","Pustaka Firdaus","Pustaka Firdaus","Pustaka Firdaus","Pena Pundi Aksana","Pena Pundi Aksana","Pena Pundi Aksana","Rajawali","Rajawali","Rajawali"};
    public static long[] tTerbit = {2012,2005,2010,2016,2013,2014,2011,2017,2013,2000,1999,2014,2012,1998,1997};
    public static String[] kTerbit = {"Yogyakarta","Malang","Yogyakarta","Jakarta","Bandung","Surabaya","Jember","Bandung","Jakarta","Yogyakarta","Surabaya","Bandung","Malang","Jember","Yogyakarta"};
    public static long[] hargaStat={20000,50000,30000,15000,75000,50000,40000,95000,20000,45000,23000,60000,70000,50000,46000};
    public static double[] diskon = {0.20,0.5,0.15,0.3,0.25,0.4,0.7,0.6,0.15,0.7,0.5,0.9,0.40,0.45,0.78};
    public static String[] discon = {"20%","50%","15%","30%","25%","40%","70%","60%","15%","70%","50%","90%","40%","45%","78%"};
    public static String[] kategori = {"Teknologi","Teknologi","Teknologi","Sejarah","Sejarah","Sejarah","Filsafat","Filsafat","Filsafat","Agama","Agama","Agama","Politik","Politik","Politik"};
    public static int[] stok = {4,5,6,7,8,9,10,3,4,5,6,7,8,2,12};

    //method main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n = 10;
        do {
            n = scan.nextByte();
            if(n==0) break;
            String cari = scan.nextLine();
            cari = scan.nextLine();
            Buku1 a = new Buku1(cari);
            a.printAll();
        } while (n!=0);
        }
    }
