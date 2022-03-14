import java.util.ArrayList;

public class Cars extends Modifying {
    ArrayList<String> getText= new ArrayList<>();
    public Cars(String name, double cost) throws MyException {
        super(name, cost);
    }


    public Cars() {
    }

    @Override
    public String toString() {
        for(int y=0 ; y<super.getBoolsString().size();y++) {
            if(super.getBoolsString().get(y).equals("abs")) {
                if (super.isAbs()) {
                    getText.add("ABS");
                }

            }
            if(super.getBoolsString().get(y).equals("musicSystem")){
                if(super.isMusicSystem()){
                    getText.add("Music System");
                }
            }
            if(super.getBoolsString().get(y).equals("airBag")){
                if(super.isAirBag()){
                    getText.add("Air Bag");
                }
            }
            if(super.getBoolsString().get(y).equals("sunRoof")){
                if(super.isSunRoof()){
                    getText.add("Sunroof");
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
            text = text +"having a total price of "+super.getCost()+" TL";
            return text;
        }
    }
    public ArrayList<String> getGetText() {
        return getText;
    }
}
