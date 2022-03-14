import java.util.ArrayList;

public abstract class Modifying extends Automobile{
    final double abss=5000;
    final double music=1000;
    final double airbags=3000;
    final double sunroof=2000;
    final double seatheating=2000;



    private ArrayList<String> boolsString = new ArrayList<>();
    boolean abs = false;
    boolean seatHeating= false;
    boolean musicSystem= false;
    boolean sunRoof = false;
    boolean airBag= false;

    public Modifying(String name, double cost) {
        super(name, cost);
    }

    public Modifying() {
    }


    public void addAbs (){
        super.setCost(super.getCost()+abss);
        abs=true;
        boolsString.add("abs");
    }
    public void addMusicSystem(){
        super.setCost(super.getCost() + music);
        musicSystem = true;
        boolsString.add("musicSystem");
    }
    public void addAirBag(){
        super.setCost(super.getCost() + airbags);
        airBag = true;
        boolsString.add("airBag");
    }
    public void addSunRoof(){
        super.setCost(super.getCost() + sunroof);
        sunRoof = true;
        boolsString.add("sunRoof");
    }
    public void addSeatHeating(){
        super.setCost(super.getCost() + seatheating);
        seatHeating=true;
        boolsString.add("seatHeating");
    }
    public boolean isSeatHeating(){
        return seatHeating;
    }
    public boolean isAbs() {
        return abs;
    }
    public boolean isMusicSystem() {
        return musicSystem;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public ArrayList<String> getBoolsString() {
        return boolsString;
    }
}
