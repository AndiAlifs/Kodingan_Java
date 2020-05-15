
public class Perkalian extends Matematika {

    @Override
    public double operasi(int x, int y) {
        return x*y;
    }

    public Perkalian(int x, int y) {
        super(x, y);
        hasil = operasi(x, y);
    }

}