import java.lang.Math;
public class Healer extends Avatar {

    public Healer(int lev) {
        super(1500 + (80 * lev), 100 + (10 * lev), 500 + (10 * lev));
    }

    @Override
    public void attack(Avatar x) {
        x.receiveDamage((int)Math.round(this.attackPoint*1.3));
    }
    
    public void healAllMember(Avatar[] team){
        for (int i=0;i<team.length;i++){
            team[i].receiveHeal((int)Math.round(this.attackPoint*0.1));
        }
        System.out.println("Healer heals all team member");
    }
}