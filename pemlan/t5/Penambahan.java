
public class Penambahan extends Matematika {

    @Override
    public double operasi(int x, int y) {
        return x + y;
    }

    public Penambahan(int x, int y) {
        super(x, y);
        hasil = operasi(x, y);
    }

}