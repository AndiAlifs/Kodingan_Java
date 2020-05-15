
public abstract class Matematika {
    int x;
    int y;
    double hasil;

    public abstract double operasi(int x, int y);

    public Matematika(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Hasil Operasi " + this.x + " dan " + this.y + " adalah " + this.hasil;
    }
}