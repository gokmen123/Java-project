public class Automobile {
    private String name;
    private double cost;

    public Automobile(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public Automobile(){
        this.name="";
        this.cost=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {

        this.cost = cost;
    }
    public String toString(){
        return name +" having a total price of "+ cost+ " TL";
    }
}
