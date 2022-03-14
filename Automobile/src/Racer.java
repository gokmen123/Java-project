public class Racer extends Motorbike{
    final String names= "Racer";
    final double costs= 60000;

    public Racer(String name, double cost) {
        super(name, cost);
    }

    public Racer(){
        super.setName(names);
        super.setCost(costs);
    }
}
