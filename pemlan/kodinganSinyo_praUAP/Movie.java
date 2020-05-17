public class Movie {
    String name;
    String plot;

    public Movie(String name, String plot, int i) {
        this.name = name;
        this.plot = plot;
        printAll(i);
    }

    public String getName(){
        return this.name;
    }

    public String getPlot(){
        return this.plot;
    }

    public void printAll(int i){
        System.out.println("Movie #" + i +
                            " : " + getName() + "\n" +
                            "Plot: " + getPlot() + "\n");
    }

}
