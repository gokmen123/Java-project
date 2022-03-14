import java.io.*;
import java.util.Scanner;
public class Bilgiler {
    public static void main(String[] args) throws IOException {
        int j=0;
        boolean k=true;
        String [] name=new String[50];
        String [] surname=new String[50];
        String [] card= new String[50];
        String [] password = new String[50];
        Scanner reader= new Scanner(System.in);





        while (k==true){
            System.out.print("Please enter your credict card number:");
            String a = reader.nextLine(); // kart no
            card[j] = a;

            System.out.print("Please enter your name:");
            String x = reader.nextLine(); //name
            name[j] = x;

            System.out.print("Please enter your surname:");
            String y = reader.nextLine(); //surname
            surname[j] = y;

            System.out.print("Please enter your password:");
            String z = reader.nextLine(); //password
            password[j] = z;

            System.out.print("İf you dont wanna add more people print -1:");
            String cont = reader.nextLine(); //devam için

            if (Integer.valueOf(cont) == -1) {
                k=false;

            }
            else{
                k=true;
                j++;
            }



        }
        File x=new File("C:/Users/ALİ GÖKMEN/java/Bilgiler/src/bilgiler.txt");
        FileWriter y= new FileWriter(x);
        BufferedWriter bf = new BufferedWriter(y);
        for(int i=0 ; i<=j;i++){
            bf.write(card[i]+" "+ name[i] + " "+surname[i]+" "+ password[i] + "\n");
        }
        bf.close();
        y.close();
        j=0;












    }




}
