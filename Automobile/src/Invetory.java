import java.util.ArrayList;

public class Invetory {
    int cars =0;
    int motorbikes=0;
    double totalPrice=0;
    boolean check;
    ArrayList<Object> inventory = new ArrayList<>();
    public void addInventory(Object o) throws MyException {
        Object c = o;
        check=false;
        if(c instanceof Cars){
            check=true;
            try{
                if(((Cars) c).isSeatHeating()){
                    ((Cars) c).setCost(((Cars) c).getCost()-((Cars) c).seatheating);
                    throw new MyException();
                }
            }
            catch (MyException e ){
                System.out.println(e.getMessage());
            }
        }
        if(c instanceof Motorbike){
            check=true;
            try{
                if(((Motorbike) c).isMusicSystem()){
                    ((Motorbike) c).setCost(((Motorbike) c).getCost()-((Motorbike) c).music);
                    throw new MyException();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
            try{
                if(((Motorbike) c).isSunRoof()){
                    ((Motorbike) c).setCost(((Motorbike) c).getCost()-((Motorbike) c).sunroof);
                    throw new MyException();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
            try{
                if(((Motorbike) c).isAirBag()){
                    ((Motorbike) c).setCost(((Motorbike) c).getCost()-((Motorbike) c).airbags);
                    throw new MyException();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
        if(check==false && c instanceof Modifying){
            try{
                if(((Modifying) c).isAbs()){
                    ((Modifying) c).setCost(((Modifying) c).getCost()-((Modifying) c).abss);
                    throw new MyException();
                }
            }
            catch (MyException e ){
                System.out.println(e.getMessage());
            }
            try{
                if(((Modifying) c).isSeatHeating()){
                    ((Modifying) c).setCost(((Modifying) c).getCost()-((Modifying) c).seatheating);
                    throw new MyException();
                }
            }
            catch (MyException e ){
                System.out.println(e.getMessage());
            }
            try{
                if(((Modifying) c).isSunRoof()){
                    ((Modifying) c).setCost(((Modifying) c).getCost()-((Modifying) c).sunroof);
                    throw new MyException();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
            try{
                if(((Modifying) c).isAirBag()){
                    ((Modifying) c).setCost(((Modifying) c).getCost()-((Modifying) c).airbags);
                    throw new MyException();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
            try{
                if(((Modifying) c).musicSystem){
                    ((Modifying) c).setCost(((Modifying) c).getCost()-((Modifying) c).music);
                    throw new MyException();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
        }

        inventory.add(o);


    }

    @Override
    public String toString()  {
        String inv="";
        for(Object o : inventory){
            check=false;
            if(o instanceof Cars){
                inv = inv + o+"\n";
                totalPrice = totalPrice + ((Cars) o).getCost();
                cars= cars+1;
                check=true;
            }
            if(o instanceof Motorbike){
                inv = inv + o+"\n";
                totalPrice= totalPrice + ((Motorbike) o).getCost();
                motorbikes=motorbikes+1;
                check=true;
            }
            if(!check && o instanceof Modifying) {
                inv = inv + o + "\n";
                totalPrice = totalPrice + ((Modifying) o).getCost();
            }

        }

        inv= inv +"TOTAL : "+ inventory.size()+" Vehicles including "+ cars +" Cars and "+motorbikes+ " Motorbikes having a total price of "+totalPrice+" TL";
        return inv;
    }


}
