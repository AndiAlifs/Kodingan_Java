import java.lang.Math;
public class Assassin extends Avatar{

    public Assassin(int lev) {
        super(2500 + (80 * lev), 200 + (10 * lev), 750 + (10 * lev));
    }

    @Override
    public void attack(Avatar x) {
        x.receiveDamage((int)Math.round(x.defense*0.2)+this.attackPoint);
    }
}