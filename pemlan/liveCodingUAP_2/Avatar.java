public abstract class Avatar{
    int healthPoint;
    int maxHP;
    int defense;
    int attackPoint;
    boolean lifeStatus;

    public Avatar(int hp, int def, int att) {
        lifeStatus = true;
        this.healthPoint = hp;
        this.maxHP = this.healthPoint;
        this.defense = def;
        this.attackPoint = att;
    }
    
    public void receiveDamage(int att){
        int true_damage = att - this.defense;
        this.healthPoint -= true_damage;
        if (this.healthPoint<=0) {
            healthPoint = 0;
            lifeStatus = false;
        }
    }

    public abstract void attack(Avatar x);

    public void receiveHeal(int heal){
        this.healthPoint += heal;
        if (this.healthPoint > maxHP){
            this.healthPoint = maxHP;
        }
    }

    public void healAllMember(Avatar[] x){}
}