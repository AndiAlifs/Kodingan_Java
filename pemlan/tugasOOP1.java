import java.util.*;
//Import java util untuk membaca masukan

class Buku{
    //deklarasi attributes  yang digunakan dalam class buku
    public String[] judul_b = new String[3];
    public String[] penulis_b = new String[3];
    public String[] penerbit_b = new String[3];
    public long[] tTerbit_b = new long[3];
    public String[] kTerbit_b = new String[3];
    public long[] hargaStat_b = new long[3];
    public double[] diskon_b = new double[3];
    public String[] discon_b = new String[3];
    public String[] kategori_b = new String[3];
    public long[] hargaAsli_b =new long[judul_b.length];

    //deklarasi method setAll sebagai setter attributes
    //pada class buku
    public void setAll(int n,int x){
        this.judul_b[x] = tugasOOP1.judul[n];
        this.penulis_b[x] = tugasOOP1.penulis[n];
        this.penerbit_b[x] = tugasOOP1.penerbit[n];
        this.tTerbit_b[x] = tugasOOP1.tTerbit[n];
        this.kTerbit_b[x] = tugasOOP1.kTerbit[n];
        this.hargaStat_b[x] = tugasOOP1.hargaStat[n];
        this.diskon_b[x] = tugasOOP1.diskon[n];
        this.discon_b[x] = tugasOOP1.discon[n];
        this.kategori_b[x] = tugasOOP1.kategori[n];
        //Setter harga bersih menggunakan method setHargaAsli
        this.hargaAsli_b[x] = setHargaAsli(this.hargaStat_b[x],this.diskon_b[x]);
    }

    //Kontruktor class buku agar setiap entitas langsung memiliki
    //attributes sesuai kategori yang diberikan di parameter
    public Buku(String s){
        int j=0;
        for (int i=0;i<15;i++){
            if (tugasOOP1.kategori[i].equals(s)){
                setAll(i,j);
                j++;
            }
        }

    }

    //method setHargaAsli untuk menentukan harga besih setelah diskon
    public long setHargaAsli(long h,double d){
        double temp = h*d;
        long temp1 = h - (long)temp;
        return temp1;
    }

    //method printAll untuk menampikan seluruh attributes dari entitas
    //class buku
    public void printAll(){
        System.out.printf("Kategori %s%n%n",this.kategori_b[0]);
        for (int i=0; i<=2;i++) {
            System.out.printf("%s %d :%s%n","Judul Buku",i+1,this.judul_b[i]);
            System.out.printf("%-12s :%s%n","Penulis",this.penulis_b[i]);
            System.out.printf("%-12s :%s%n","Penerbit",this.penerbit_b[i]);
            System.out.printf("%-12s :%s%n","Penulis",this.penulis_b[i]);
            System.out.printf("%-12s :%s%n","Tahun Terbit",this.tTerbit_b[i]);
            System.out.printf("%-12s :%s%n","Kota Terbit",this.kTerbit_b[i]);
            System.out.printf("%-12s :%d%n","Harga",this.hargaStat_b[i]);
            System.out.printf("%-12s :%s%n","Discount",this.discon_b[i]);
            System.out.printf("%-12s :%s%d%n%n","Harga Bersih","Rp.",this.hargaAsli_b[i]);
        }
    }
}

//class utama
public class tugasOOP1{
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

    //method main
    public static void main(String[] args) {
        //memanggil fungsi scan untuk membaca input
        Scanner scan = new Scanner(System.in);
        //deklarasi iterator n
        byte n = scan.nextByte();
        //melakukan pengulangan sebanyak n
        for (int i=1;i<=n;i++){
            //menyimpan data yang dibaca di input
            String temps = scan.next();
            if (temps.equals("Teknologi")){
                //entitas Tech dari kelas Buku Teknologi
                Buku tech = new Buku("Teknologi");
                //method printAll dari entitas tech
                tech.printAll();
            } else if (temps.equals("Sejarah")){
                //entitas Sej dari kelas Buku dengan kategori Sejarah
                Buku sej = new Buku("Sejarah");
                //method printAll daro entitas sej
                sej.printAll();
            } else if (temps.equals("Filsafat")){
                //entitas fil dari kelas buku dengan kategori Filsafat
                Buku fil = new Buku("Filsafat");
                // method printAll dari enttas fil
                fil.printAll();
            } else if (temps.equals("Agama")){
                //entitas aga dari kelas buku dengan kategori Agama
                Buku aga = new Buku("Agama");
                //method printAll dari entita aga
                aga.printAll();
            } else if (temps.equals("Politik")){
                //entitas pol dari kelas buku dengan kategori Politik
                Buku pol = new Buku("Politik");
                //method printAll dari entitas pol
                pol.printAll();
            }
        }
    }
}
