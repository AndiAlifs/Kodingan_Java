package pemlan;
public class Mobil{
    public String nama;
    public String warna;
    public String tglPajak;
    public int kecepatan;
    public Integer penumpang = 2;

    public void info() {
        System.out.println(this.nama);
        System.out.println(this.warna);
        System.out.println(this.kecepatan);
        System.out.println(this.penumpang.floatValue());
        System.out.println(this.tglPajak);
    }

    public void setKecepatan(int kec) {
        this.kecepatan = kec;
    }z

    public void cetakAttribute() {
        System.out.println("Nama mobil : "+nama);
        System.out.println("Kecepatan mobil : "+cekKecepatan());
        System.out.println("Warna mobil : "+this.warna);
    }
    public int cekKecepatan() {
        return kecepatan;
    }

    public Mobil(){
        System.out.println("Kontruktor tanpa Parameter");
    }

    public Mobil(String parameter){
        System.out.println("Kontruktor dibuat");
        nama = parameter;
    }

    public Mobil(String parameter, String warnas){
        System.out.println("Kontruktor dibuat");
        nama = parameter;
        warna = warnas;
    }
}
