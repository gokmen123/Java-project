import java.io.*;
import java.util.Scanner;
public class Okuma {
    public static void main(String[] args) throws IOException {
        File x= new File("src/bilgiler.txt");
        FileReader y= new FileReader(x);
        BufferedReader bf = new BufferedReader(y);
        String[] o;
        String line = bf.readLine();
        Scanner reader= new Scanner(System.in);
        int sayaç=0;
        String [] id,name,surname,password;
        id=new String[1000];
        surname=new String[1000];
        name=new String[1000];
        password=new String[1000];



        boolean a=true;
        while(a==true && line!=null){
            o=line.split(" ");
            id[sayaç]=o[0];
            name[sayaç]=o[1];
            surname[sayaç]=o[2];
            password[sayaç]=o[3];
            line=bf.readLine();
            sayaç++;
        }
        String [] kitleme= new String[1000];
        boolean check=true;
        boolean check1 = true;
        boolean check2=true;
        boolean check3=true;
        boolean check4=true;
        boolean deneme;
        int passwordenter=0;
        int kitlemesayaç=0;
        kitleme[0]=" ";
        int kitlemekontrol=0;

        for(int ğ=0 ; ğ<sayaç; ){
            System.out.println("---------------------------------------------------------------------------------");
            System.out.print("| Please enter your card id:");
            String cardid=reader.nextLine();
            System.out.println("---------------------------------------------------------------------------------");
            while(check==true){

                for(;kitlemekontrol<=kitlemesayaç;){
                    if(kitleme[kitlemekontrol].equals(cardid)){
                        check3=false;
                        break;
                    }
                    else{
                        kitlemekontrol++;
                        if(kitlemekontrol>kitlemesayaç){
                            check3=true;
                            break;
                        }
                    }

                }

                if(cardid.equals(id[ğ]) && ğ!=sayaç && check3==true) {
                    System.out.print("| Please enter your Password:");
                    String cardpassword = reader.nextLine();
                    System.out.println("---------------------------------------------------------------------------------");

                    int kalan=3;

                    if (cardpassword.equals(password[ğ])&& ğ!=sayaç) {
                        System.out.println("| Card Id = " + id[ğ] +"|"+ " Name= " + name[ğ] + "|"+" Surname= " + surname[ğ] +"|"+ " Password is '" + password[ğ] + "' |");
                        System.out.println("---------------------------------------------------------------------------------");
                        check=false;
                    }
                    else{
                        passwordenter++;
                        System.out.println("| You entered Wrong Password " +(kalan-passwordenter)+" left!");
                        System.out.println("---------------------------------------------------------------------------------");
                        if(passwordenter==3){
                            check=false;
                            kitlemesayaç++;
                            kitleme[kitlemesayaç]=id[ğ];
                            break;

                        }
                    }
                }
                else {
                    ğ++;
                    check1=false;
                    if(ğ==sayaç){
                        System.out.println("| You entered Wrong ID or you used your all password right!");
                        System.out.println("---------------------------------------------------------------------------------");
                        check=false;

                        break;
                    }
                }

            }
            System.out.print("| İf you want to quit press q:");
            String quit= reader.nextLine();
            if("q".equals(quit) ){
                check=false;
                ğ=sayaç;
            }
            else{
                check=true;
                ğ=0;
                passwordenter=0;
                kitlemekontrol=0;


            }


        }





    }
}
