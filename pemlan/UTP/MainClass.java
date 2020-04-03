package UTP;

import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
    ArrayList<Buku> daftarBuku = new ArrayList<Buku>();
    ArrayList<Peminjam> daftarPeminjam = new ArrayList<BPeminjam>();

    Buku a = new Buku("A","",3);
    daftarBuku.add(a);
    Buku d = new Buku("D","",3);
    daftarBuku.add(d);
    Buku e = new Buku("E","",3);
    daftarBuku.add(e);
    Buku f = new Buku("F","",3);
    daftarBuku.add(f);
    Buku i = new Buku("I","",2);
    daftarBuku.add(i);
    Buku j = new Buku("J","",2);
    daftarBuku.add(j);
    Buku k = new Buku("K","",2);
    daftarBuku.add(k);
    Buku l = new Buku("L","",2);
    daftarBuku.add(l);
    Buku m = new Buku("M","",2);
    daftarBuku.add(m);
    Buku o = new Buku("O","",1);
    daftarBuku.add(o);

    Pelanggan a = new Pelanggan("A","",3);
    daftarPeminjam.add(a);
    Pelanggan b = new Pelanggan("B","",6);
    daftarPeminjam.add(b);
    Pelanggan c = new Pelanggan("C","",3);
    daftarPeminjam.add(c);

    }
}