import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws MyException  {
        Invetory invetory = new Invetory();
        Sivic x = new Sivic();
        x.addAbs();
        x.addMusicSystem();
        x.addAirBag();
        invetory.addInventory(x);


        Sivic y = new Sivic();
        y.addAbs();
        y.addSunRoof();
        invetory.addInventory(y);

        Sity sity = new Sity();
        sity.addMusicSystem();
        sity.addSunRoof();
        invetory.addInventory(sity);

        Racer  racer = new Racer();
        racer.addAbs();
        racer.addSeatHeating();
        invetory.addInventory(racer);

        Scooter scooter = new Scooter();
        scooter.addSeatHeating();
        invetory.addInventory(scooter);



        System.out.println(invetory);


    }
}
