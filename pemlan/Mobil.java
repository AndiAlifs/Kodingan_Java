package pemlan;
public class Mobil{
    private int kecepatan;
    public String nama = "";
    public String warna= "";

    public void setKecepatan(int kec) {
        this.kecepatan = kec;
    }

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