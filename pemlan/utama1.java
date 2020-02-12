package pemlan;
public class utama1{

    // public static void info(Mobil mobil){
    //     System.out.println("info "+mobil.nama);
    //     System.out.println("warna "+mobil.warna);
    //     System.out.println("Kecepatan "+mobil.kecepatan);

    // }
    public static void main(String[] args) {
        Mobil x_pander = new Mobil("X Pander Bosque","Merah");
        x_pander.setKecepatan(20);
        x_pander.cetakAttribute();
        // info(x_pander);

    }

}