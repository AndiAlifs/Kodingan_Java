import java.lang.Math;

public class main {
    static int randomize(){
        int randomNumber = (int)(Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        return randomNumber;
    }

    public static void main(String[] args) {
	    for(int i=1; i<10; i++) {
            Movie movie;
            int angkaRandom = randomize();
            switch(angkaRandom){
                case 1:
                    movie = new Starwars(i);
                    break;
                case 2:
                    movie = new Tenkinoko(i);
                    break;
                case 3:
                    movie = new Starwars(i);
                    break;
                case 4:
                    movie = new Tenkinoko(i);
                    break;
                case 5:
                    movie = new Starwars(i);
                    break;
            }
        }
    }
}