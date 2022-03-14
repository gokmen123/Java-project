import java.util.ArrayList;

public class Motorbike extends Modifying{
    ArrayList<String> getText= new ArrayList<>();
    public Motorbike(String name, double cost) {
        super(name, cost);

    }

    public Motorbike() {

    }

    public ArrayList<String> getGetText() {
        return getText;
    }

    @Override
    public String toString() {
        for(int y=0 ; y<super.getBoolsString().size();y++){
            if(super.getBoolsString().get(y).equals("abs")){
                if(super.isAbs()){
                    getText.add("ABS");
                }
            }
            if(super.getBoolsString().get(y).equals("seatHeating")){
                if(super.isSeatHeating()){
                    getText.add("Seat Heating");
                }
            }

        }
        if(getText.size()<=0){
            return super.toString();
        }
        else{
            String text="";
            text = text + super.getName()+" with ";
            for(int g =0 ; g<getText.size() ; g++){
                text = text + getText.get(g)+", ";
            }
            text = text +" having a total price of "+super.getCost()+" TL";
            return text;
        }
    }


}
