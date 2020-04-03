package UTP;

public class Peminjam {
    private String nama;
    private String noPelanggan;
    private int yangDipinjam;
    private double bayar;

    public Peminjam(String nama, String noPelanggan, int yangDipinjam, double bayar) {
        this.nama = nama;
        this.noPelanggan = noPelanggan;
        this.yangDipinjam = yangDipinjam;
        this.bayar = bayar;
    }
}