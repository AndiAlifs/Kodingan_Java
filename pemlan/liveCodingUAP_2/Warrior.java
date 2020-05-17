/**
 * Warrior
 */

import java.lang.Math;
public class Warrior extends Avatar{

    public Warrior(int lev) {
        super(3000 + (100 * lev), 250 + (10 * lev), 800 + (15 * lev));
    }

    @Override
    public void attack(Avatar x) {
        x.receiveDamage((int)Math.round(this.attackPoint*1.3));
    }

    
}