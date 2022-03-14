public class Scooter extends Motorbike{
    final String names= "Scooter";
    final double costs= 20000;

    public Scooter(String name, double cost) {
        super(name, cost);
    }

    public Scooter(){
        super.setName(names);
        super.setCost(costs);
    }
}
