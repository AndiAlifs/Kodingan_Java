public class Tank extends Avatar {

    public Tank(int lev) {
        super(5000 + (150 * lev), 400 + (15 * lev), 500 + (10 * lev));
    }

    @Override
    public void attack(Avatar x) {
        x.receiveDamage(this.attackPoint);
    }
}