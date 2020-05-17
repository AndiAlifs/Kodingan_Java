
import java.util.*;

public class MainClass {

    static void runTurn(Avatar x, String nameX, Avatar y, String nameY, int team){
        System.out.println("--TEAM "+team+" MOVES--");
        x.attack(y);
        System.out.println(nameX+" attack "+nameY);
        if (!y.lifeStatus) System.out.println(nameY + " dead");
        System.out.println("Other's team "+nameY+" Remaining HP: "+y.healthPoint);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        String[] input1 = input.split(" ");
        Avatar[] team1 = new Avatar[3];
        String[] namateam1 = new String[3];
        int team1hidup = 3;
        Avatar[] team2 = new Avatar[3];
        String[] namateam2 = new String[3];
        int team2hidup = 3;

        for (int i = 0;i<3;i++){
            String[] nama = new String[2];
            nama = input1[i].split(":");
            int lev = Integer.valueOf(nama[1]);
            if(nama[0].equals("WARRIOR")){
                team1[i] = new Warrior(lev);
                namateam1[i] = "Warrior";
            } else if (nama[0].equals("TANK")){
                team1[i] = new Tank(lev);
                namateam1[i] = "Tank";
            } else if (nama[0].equals("HEALER")){
                team1[i] = new Healer(lev);
                namateam1[i] = "Healer";
            } else if (nama[0].equals("ASSASSIN")){
                team1[i] = new Assassin(lev);
                namateam1[i] = "Assassin";
            }
        }

        int j=0;
        for (int i = 4;i<=6;i++){
            String[] nama = new String[2];
            nama = input1[i].split(":");
            int lev = Integer.valueOf(nama[1]);
            if(nama[0].equals("WARRIOR")){
                team2[j] = new Warrior(lev);
                namateam2[j] = "Warrior";
            } else if (nama[0].equals("TANK")){
                team2[j] = new Tank(lev);
                namateam2[j] = "Tank";
            } else if (nama[0].equals("HEALER")){
                team2[j] = new Healer(lev);
                namateam2[j] = "Healer";
            } else if (nama[0].equals("ASSASSIN")){
                team2[j] = new Assassin(lev);
                namateam2[j] = "Assassin";
            }
            j++;
        }

        j = 1;
        byte attackTo1 = 0;
        byte attackTo2 = 0;
        while (team1hidup > 0 && team2hidup > 0){    
            System.out.println("TURN "+j);
            
            int turn1 = -1;
            int turn2 = -1;

            for (int q=1;q<=3;q++){
                turn1++;
                if (team1[turn1].lifeStatus) {
                    runTurn(team1[turn1],namateam1[turn1],team2[attackTo2],namateam2[attackTo2],1);
                    if (namateam1[turn1].equals("Healer")) team1[turn1].healAllMember(team1);
                    if (!team2[attackTo2].lifeStatus) {
                        attackTo2++;
                        team2hidup--;
                    }
                    if (team2hidup == 0){
                        System.out.println("TEAM 1 MENANG");
                        break;
                    }
                }
                turn2++;
                if (team2[turn2].lifeStatus) {
                    runTurn(team2[turn2],namateam2[turn2],team1[attackTo1],namateam1[attackTo1],2);
                    if (namateam2[turn2].equals("Healer")) team2[turn2].healAllMember(team2);
                    if (!team1[attackTo1].lifeStatus) {
                        attackTo1++;
                        team1hidup--;
                    }
                    if (team1hidup == 0){
                        System.out.println("TEAM 2 MENANG");
                        break;
                    }
                }
            }

            

            j++;
            System.out.println("");
        }
    }
}