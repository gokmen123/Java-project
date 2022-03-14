public class Sity extends Cars{
    final String names = "Sity";
    final double costs = 40000;

    public Sity(String name, double cost) throws MyException {
        super(name, cost);
    }

    public Sity() {
        super.setName(names);
        super.setCost(costs);
    }
}
