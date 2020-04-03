package UTP;

public class Buku{
    private String judul;
    private String sinopsis;
    private int stok;
    private String penulis[];

    public Buku(String judul, String sinopsis, int stok) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.stok = stok;
    
    }
    
    public void setPenulis(int jumlahPenulis,) {
        this.penulis = new String[jumlahPenulis];

    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }
}