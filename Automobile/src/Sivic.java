public class Sivic extends Cars{
    final String names = "Sivic";
    final double costs = 50000;

    public Sivic(String name, double cost) throws MyException {
        super(name, cost);
    }

    public Sivic() {
        super.setName(names);
        super.setCost(costs);

    }
}
