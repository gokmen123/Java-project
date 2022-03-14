import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MySocialBook {
    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<Users2> allUsersList= new ArrayList<>(); //in order to add user
        ArrayList<String> blocked= new ArrayList<>(); //in order to block user
        ArrayList<String> friends= new ArrayList<>(); // in order to add friend
        ArrayList<Object> postCollect= new ArrayList<>(); // in order to collect posts
        ArrayList<Date> lastLogIn= new ArrayList<>();
        int userid=0; // in order to create a user id
        int [] signin= new int[1]; // in order to understand who sign in to the system.
        signin[0]=-1; // if no one didn't sign in
        File mn = new File(args[0]);
        FileReader vb= new FileReader(mn);
        BufferedReader vc = new BufferedReader(vb);
        String line = vc.readLine();
        String[] o; // in order to split the line that we read.
        Date login= new Date();
        while(line!=null){
            o= line.split("\t"); // in order to split with tab character
            userid++;
            Date date2= new SimpleDateFormat("MM/dd/yyyy").parse(o[3]); // in order to return a string to a date

            Users2 j = new Users2(userid,o[0],o[1],o[2],date2,o[4],blocked = new ArrayList<>(),friends= new ArrayList<>(),postCollect= new ArrayList<>(),lastLogIn=new ArrayList<>()); // in order to add a user to the system
            allUsersList.add(j); // to add users to a users list
            line=vc.readLine();
        }
         // in order to split a line that entered by users.
        /*
        File komut = new File(args[1]);
        FileReader komut1= new FileReader(komut);
        BufferedReader komut2= new BufferedReader(komut1);
        */
        boolean bool= true;
        Scanner komut2= new Scanner(System.in);

        Scanner komut1= new Scanner(System.in);
        String[] list;


        System.out.println("              MENU              ");
        System.out.println("----------------------------------");
        System.out.println("1)  REMOVEUSER (KULLANICI KALDIRMA)");
        System.out.println("2)  ADDUSER (KULLANICI EKLEME / HESAP OLUSTURMA)");
        System.out.println("3)  SHOWPOSTS (GONDERiLERi GORME)");
        System.out.println("4)  SIGNIN (GiRiS YAPMA)");
        System.out.println("5)  ADDFRIEND (ARKADAS EKLEME)");
        System.out.println("6)  REMOVEFRIEND (ARKADAS KALDIRMA)");
        System.out.println("7)  BLOCK (KULLANICI ENGELLEME)");
        System.out.println("8)  UNBLOCK (KULLANICI ENGEL KALDIRMA)");
        System.out.println("9)  LISTUSER (TÜM KULLANICILARI GORUNTULEME)");
        System.out.println("10) LISTFRIENDS (ARKADASLARINI GORUNTULEME)");
        System.out.println("11) SHOWBLOCKEDUSERS (ENGELLi KULLANICILARI GORUNTULEME)");
        System.out.println("12) SHOWBLOCKEDFRIENDS (ENGELLi ARKADASLARI GORUNTULEME)");
        System.out.println("13) UPDATEPROFILE (KiSiSEL BiLGiLERiNi GuNCELLEME)");
        System.out.println("14) SIGNOUT (CIKIS YAPMA)");
        System.out.println("15) CHPASS (SiFRE DEGisTiRME)");
        System.out.println("16) ADD-TEXT (YAZI DOSYASI EKLEME)");
        System.out.println("17) ADD-VİDEO (VIDEO EKLEME)");
        System.out.println("18) ADD-IMAGE (RESiM EKLEME)");
        System.out.println("19) REMOVELASTPOST (SON GÖNDERiYi KALDIRMA)");
        System.out.println("----------------------------------");
        while (bool) {
            String k="";
            System.out.print("Please enter your choice (Lütfen seciminizi yapınız):");
            int komut= komut1.nextInt();
            if(komut==1){ //removeuser
                System.out.print("Please enter users Id:");
                String l = komut2.nextLine();
                k= "REMOVEUSER"+"\t"+l;
            }
            if(komut==2){ //adduser
                System.out.print("Please enter Name:");
                String l= komut2.nextLine();
                System.out.print("Please enter username:");
                String c= komut2.nextLine();
                System.out.print("Please enter password:");
                String b= komut2.nextLine();
                System.out.print("Please enter date_of_birth:");
                String m= komut2.nextLine();
                System.out.print("Please enter graduated School:");
                String t= komut2.nextLine();
                k="ADDUSER"+"\t"+l+"\t"+c+"\t"+b+"\t"+m+"\t"+t;
            }
            if(komut==4) { //sıgnın
                System.out.print("Please enter username:");
                String l= komut2.nextLine();
                System.out.print("Please enter password:");
                String j= komut2.nextLine();
                k="SIGNIN"+"\t"+l+"\t"+j;
            }
            if(komut==3){//showpost
                System.out.print("Please enter username:");
                String l= komut2.nextLine();
                k= "SHOWPOSTS"+"\t"+l;
            }
            if(komut==5){
                System.out.print("Please enter a username:");
                String l= komut2.nextLine();
                k="ADDFRIEND"+"\t"+l;
            }
            if(komut==6){
                System.out.print("Please enter a username:");
                String l= komut2.nextLine();
                k="REMOVEFRIEND"+"\t"+l;
            }
            if(komut==7){
                System.out.print("Please enter a username:");
                String l= komut2.nextLine();
                k="BLOCK"+"\t"+l;
            }
            if(komut==8){
                System.out.print("Please enter a username:");
                String l= komut2.nextLine();
                k="UNBLOCK"+"\t"+l;
            }
            if(komut==9){
                k="LISTUSERS";
            }
            if(komut==10){
                k="LISTFRIENDS";
            }
            if(komut==11){
                k="SHOWBLOCKEDUSERS";
            }
            if(komut==12){
                k="SHOWBLOCKEDFRIENDS";
            }
            if(komut==13) { //adduser
                System.out.print("Please enter Name:");
                String l = komut2.nextLine();
                System.out.print("Please enter Date of birth:");
                String c = komut2.nextLine();
                System.out.print("Please enter graduated school:");
                String b = komut2.nextLine();
                k="UPDATEPROFILE"+"\t"+l+"\t"+c+"\t"+b;
            }
            if(komut==14){
                k="SIGNOUT";
            }
            if(komut==15) { //adduser
                System.out.print("Please enter Old password:");
                String l = komut2.nextLine();
                System.out.print("Please enter New password:");
                String c = komut2.nextLine();
                k="CHPASS"+"\t"+l+"\t"+c;
            }
            if(komut==19){
                k="REMOVELASTPOST";
            }
            if(komut==16){
                System.out.print("Please enter the text or message:");
                String l = komut2.nextLine();
                System.out.print("Please enter the longtidue:");
                String c = komut2.nextLine();
                System.out.print("Please enter latidue:");
                String m = komut2.nextLine();
                System.out.print("Please enter tagged friends put(:) double dot between friends!:");
                String n = komut2.nextLine();
                k="ADDPOST-TEXT"+"\t"+l+"\t"+c+"\t"+m+"\t"+n;
            }
            if(komut==17){
                System.out.print("Please enter the text or message:");
                String l = komut2.nextLine();
                System.out.print("Please enter the longtidue:");
                String c = komut2.nextLine();
                System.out.print("Please enter latidue:");
                String m = komut2.nextLine();
                System.out.print("Please enter tagged friends put(:) double dot between friends!:");
                String n = komut2.nextLine();
                System.out.print("Please enter filepath:");
                String b = komut2.nextLine();
                System.out.print("Please enter video duration:");
                String v = komut2.nextLine();
                k="ADDPOST-VIDEO"+"\t"+l+"\t"+c+"\t"+m+"\t"+n+"\t"+b+"\t"+v;
            }
            if(komut==18){
                if(komut==17){
                    System.out.print("Please enter the text or message:");
                    String l = komut2.nextLine();
                    System.out.print("Please enter the longtidue:");
                    String c = komut2.nextLine();
                    System.out.print("Please enter latidue:");
                    String m = komut2.nextLine();
                    System.out.print("Please enter tagged friends put(:) double dot between friends!:");
                    String n = komut2.nextLine();
                    System.out.print("Please enter filepath:");
                    String b = komut2.nextLine();
                    System.out.print("Please enter image resolution:");
                    String v = komut2.nextLine();
                    k="ADDPOST-VIDEO"+"\t"+l+"\t"+c+"\t"+m+"\t"+n+"\t"+b+"\t"+v;
                }
            }
            Date dates = new Date();
            SimpleDateFormat info= new SimpleDateFormat("MM/dd/yyyy"); // date type for birth_dates
            //System.out.print("Command:"); //command + name + username + password + date of birth + graduated school
            list = k.split("\t"); // split the line that entered by user with tab
            if (list[0].equals("ADDUSER") && signin[0] == -1) {
                boolean adduser = true;
                if (list.length == 6) {
                    for (int kj = 0; kj < allUsersList.size(); kj++) {
                        if (allUsersList.get(kj).getUsername().equals(list[2])) { //if we have already had that username
                            adduser=false;
                            System.out.println("This user is already exist");
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                        if(adduser==true && kj==(allUsersList.size()-1)){
                            userid++;
                            Date date1= new SimpleDateFormat("MM/dd/yyyy").parse(list[4]);
                            Users2 om= new Users2(userid,list[1],list[2],list[3],date1,list[5],blocked= new ArrayList<>(),friends=new ArrayList<>(),postCollect= new ArrayList<>(),lastLogIn=new ArrayList<>()); //to add a new user
                            allUsersList.add(om); // to add that user to our user list
                            System.out.println(list[1] +" has been successfully added.");
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }
                }
                if (list.length != 6) {
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
            }

            if (list[0].equals("REMOVEUSER") && signin[0] == -1) {
                for (int i = 0; i < allUsersList.size(); i++) {
                    boolean contain = false;
                    int Id = Integer.valueOf(list[1]);
                    if (list[0].equals("REMOVEUSER") && list.length != 2) {
                        System.out.println("The command is not readable!");
                        System.out.println("-----------------------------------------------------------");
                        break ;
                    }
                    if (allUsersList.get(i).getId()==Id) { // if we have that id
                        allUsersList.remove(i); // in order to remove all information about that user
                        contain=true;
                        System.out.println("User Successfully removed!");
                        System.out.println("-----------------------------------------------------------");
                        break ;

                    }
                    if (i==(allUsersList.size()-1) && contain == false) { // if we dont have that id in our system
                        System.out.println("No such user!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }


                }

            }



            if (list[0].equals("SIGNIN") && signin[0] == -1 && list.length == 3) {
                int j = 0;
                boolean sing2 = false;
                for (; j<allUsersList.size(); j++) {
                    if (allUsersList.get(j).getUsername().equals(list[1]) && allUsersList.get(j).getPassword().equals(list[2])) { // if the entered password and the username are the same with a user in our system.
                        System.out.println("You have successfully signed in! ");
                        System.out.println("-----------------------------------------------------------");
                        sing2 = true;
                        signin[0] = j; // in order to access the entered users information.
                        login=new Date();
                        break;
                    }

                }

                if (sing2 == false ) { // if the password or the username is wrong
                    System.out.println("Invalid username or password! Please try again!");
                    System.out.println("-----------------------------------------------------------");
                }


            }

            if (list[0].equals("SIGNOUT"))  {
                if(signin[0]==-1 && list.length==1){ //if no user signed in the system.
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (list.length != 1 && signin[0]!=-1) {
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if(signin[0]!=-1 && list.length==1) { //if the command is right
                    if(allUsersList.get(signin[0]).getLastLogIn().size()<=0){
                        allUsersList.get(signin[0]).getLastLogIn().add(login);
                    }
                    else{
                        allUsersList.get(signin[0]).setLastLogIn(login);
                    }
                    signin[0] = -1; // in order to understand no one entered the system.
                    System.out.println("You have successfully signed out!");
                    System.out.println("-----------------------------------------------------------");
                }

            }

            if (list[0].equals("UPDATEPROFILE")) {
                if (signin[0] == -1) { // if no one signin the system
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");

                }
                if (list.length != 4 && signin[0] != -1) { // if the command is not right.
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 4) { // if the command is right and a user signed in the system.
                    Date date3= new SimpleDateFormat("MM/dd/yyyy").parse(list[2]); // in order to collect the string as a date.
                    allUsersList.get(signin[0]).setName(list[1]); // in order to access the user that signin and change his name.
                    allUsersList.get(signin[0]).setDateOfBirth(date3); // in order to change the date of birth of users that signin
                    allUsersList.get(signin[0]).setGraduateSchool(list[3]); // in order to change the user's school.
                    System.out.println("Your user profile has been successfully updated");
                    System.out.println("-----------------------------------------------------------");
                }


            }

            if (list[0].equals("CHPASS")) {
                if (signin[0] == -1) {
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");

                }
                if (list.length != 3 && signin[0] != -1) {
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");

                }
                if (signin[0] != -1 && !allUsersList.get(signin[0]).getPassword().equals(list[1]) && list.length == 3) { // if the user's password mistmach the password in the our system.
                    System.out.println("Password mismatch!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && allUsersList.get(signin[0]).getPassword().equals(list[1]) && list.length==3) { // if the passwords are equal.
                    allUsersList.get(signin[0]).setPassword(list[2]);
                    System.out.println("Your password is successfully changed!");
                    System.out.println("-----------------------------------------------------------");
                }
            }

            if (list[0].equals("LISTUSERS")) {
                if (signin[0] == -1) { // if no one signed in the system.
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 1) {
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length==1) { // if a user signed in and the command is right.
                    int listall = 0;
                    for (; listall < allUsersList.size(); listall++) {
                        System.out.println("Name: " + allUsersList.get(listall).getName()); // in order to access the users's name
                        System.out.println("Username: " + allUsersList.get(listall).getUsername()); // users username
                        System.out.println("Date of Birth: " + info.format(allUsersList.get(listall).getDateOfBirth())); //users bith. We format them here as MM/dd/yyyy
                        System.out.println("School: " + allUsersList.get(listall).getGraduateSchool()); //users school
                        System.out.println("-------------------------------");
                    }
                }
            }


            if (list[0].equals("BLOCK")) {
                boolean block_check_outside=false;
                for(int uj=0 ;uj<allUsersList.size();uj++){
                    boolean blockcheck = false;
                    if (signin[0] == -1) { // if no one signed in the system.
                        System.out.println("Error: Please sign in and try again.");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (signin[0] != -1 && list.length != 2) { // if somenone signed in but the command is wrong
                        System.out.println("The command is not readable!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (uj==(allUsersList.size()-1) && signin[0] != -1 && list.length == 2 && !allUsersList.get(uj).getUsername().equals(list[1]) && block_check_outside==false) { //if there is no such user in our system
                        System.out.println("No such user!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (signin[0] != -1 && allUsersList.get(signin[0]).getUsername().equals(list[1])) { // in order to prevent blocking yourselves
                        System.out.println("You cannot block yourselves!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (signin[0] != -1 && !allUsersList.get(signin[0]).getUsername().equals(list[1]) && allUsersList.get(uj).getUsername().equals(list[1])) {
                        block_check_outside=true;
                        if (allUsersList.get(signin[0]).getBlockedList().size()>0) { // if the user already blocked some users
                            if(allUsersList.get(signin[0]).getBlockedList().contains(list[1])){ // if the user already blocked that user
                                System.out.println("This user is already blocked!");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            }
                            else { // if the users first time blocking that user
                                allUsersList.get(signin[0]).getBlockedList().add(list[1]);
                                System.out.println(list[1] + " has been successfully blocked! ");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            }

                        }
                        else { // if the user blocking other users first time
                            allUsersList.get(signin[0]).getBlockedList().add(list[1]);
                            System.out.println(list[1] + " has been successfully blocked! ");
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }
                }



            }
            if (list[0].equals("UNBLOCK")) {
                boolean unblock1=true;
                if (signin[0] == -1) { // if no one signed in the system
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 2) { // if the command is not right
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 2) { // if the command is right and a user already signed in the system
                    if(allUsersList.get(signin[0]).getBlockedList().size()>0){ // if that user already blocked some user
                        if(allUsersList.get(signin[0]).getBlockedList().contains(list[1])){ // if we have that user in our block list
                            for(int k1=0 ; k1<allUsersList.get(signin[0]).getBlockedList().size();k1++){
                                if(allUsersList.get(signin[0]).getBlockedList().get(k1).equals(list[1])){
                                    allUsersList.get(signin[0]).getBlockedList().remove(k1); // in order to unblock that user
                                    System.out.println(list[1]+" has been successfully unblocked!");
                                    System.out.println("-----------------------------------------------------------");
                                    break;
                                }
                            }
                        }
                        else{ // if we dont have that user in our block list
                            System.out.println("No such user in your blocked-user list!");
                            System.out.println("-----------------------------------------------------------");

                        }
                    }
                    else{ // if we haven't blocked any user yet
                        System.out.println("You have not blocked any user yet!");
                        System.out.println("-----------------------------------------------------------");
                    }
                }

            }

            if (list[0].equals("SHOWBLOCKEDUSERS")) {
                int all;
                boolean blocked_user1 = true;
                if (signin[0] != -1 && list.length != 1) { //if someone signed in the system but the command false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] == -1) { // if no one sigend in the system
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 1) {
                    if(allUsersList.get(signin[0]).getBlockedList().size()>0){ // if we(signed in user) have blocked some users already
                        for(int yg=0 ; yg<allUsersList.get(signin[0]).getBlockedList().size();yg++){
                            for (int usernamecheck = 0; usernamecheck < allUsersList.size(); usernamecheck++) {
                                if (allUsersList.get(signin[0]).getBlockedList().get(yg).equals(allUsersList.get(usernamecheck).getUsername())) { // in order to get informations of blocked user
                                    all = usernamecheck;
                                    System.out.println("Name: " + allUsersList.get(all).getName()); // in order to get blocked user name
                                    System.out.println("Username: " + allUsersList.get(all).getUsername());
                                    System.out.println("Date Of Birth: " + info.format(allUsersList.get(all).getDateOfBirth())); //in oder to change data type with MM/dd/yyyy
                                    System.out.println("School: " + allUsersList.get(all).getGraduateSchool());
                                    System.out.println("----------------------------------------");
                                    blocked_user1 = false;
                                }
                            }
                        }



                    }
                    else{ // if we(signed in user) haven't blocked any user yet!
                        System.out.println("You haven’t blocked any user yet");
                        System.out.println("-----------------------------------------------------------");
                    }

                }
            }

            if (list[0].equals("ADDFRIEND")) {
                boolean checkblocked2=true;
                boolean checkblockedfriend = true;
                for(int h2=0;h2<allUsersList.size();h2++){
                    if (signin[0] == -1) { // if no one entered the system
                        System.out.println("Error: Please sign in and try again.");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (signin[0] != -1 && list.length != 2) { // if some user signed in but the command false
                        System.out.println("The command is not readable!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (h2==(allUsersList.size()-1) &&signin[0] != -1 && checkblocked2==true && !allUsersList.get(h2).getUsername().equals(list[1])) { // if there is no such user in our system
                        System.out.println("No such user!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (signin[0] != -1 && list.length == 2 && allUsersList.get(signin[0]).getUsername().equals(list[1])) { //in order to prevent adding yourselves as a friend
                        System.out.println("You cannot add yourselves as a friend!");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    if (signin[0] != -1 && list.length == 2  && !allUsersList.get(signin[0]).getUsername().equals(list[1]) && allUsersList.get(h2).getUsername().equals(list[1])) {
                        if(allUsersList.get(signin[0]).getFriendsList().size()>0){ // if we(signed in user) already have some friend
                            if(allUsersList.get(signin[0]).getFriendsList().contains(list[1])){ // if the user already have that friend
                                System.out.println("This user is already in your friend list!");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            }
                            else{ // if the user dont have that friend.
                                allUsersList.get(signin[0]).getFriendsList().add(list[1]); //  to add friend the users friends list
                                System.out.println(list[1]+" has been successfully added to your friend list.");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            }
                        }
                        else{ // if the signed in users adding friend first time
                            allUsersList.get(signin[0]).getFriendsList().add(list[1]); //  to add friend the users friends list
                            System.out.println(list[1]+" has been successfully added to your friend list.");
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }
                }
            }
            if (list[0].equals("LISTFRIENDS")) {
                boolean list_friend1 = true;
                if (signin[0] == -1) { // if no user entered the system
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 1) { // if a user signed in the system but the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 1) { // if the command true and a user signed in the system already
                    if(allUsersList.get(signin[0]).getFriendsList().size()>0) { // if that user already has some friends
                        for(int list_friends=0;list_friends<allUsersList.get(signin[0]).getFriendsList().size(); list_friends++){
                            for(int kj=0; kj<allUsersList.size();kj++){
                                if(allUsersList.get(signin[0]).getFriendsList().get(list_friends).equals(allUsersList.get(kj).getUsername())){ // in order to access the user's friends informations.
                                    System.out.println("Name: "+allUsersList.get(kj).getName());
                                    System.out.println("Username: "+allUsersList.get(kj).getUsername());
                                    System.out.println("Date Of Birth: "+info.format(allUsersList.get(kj).getDateOfBirth())); // in order to change the users friends birth dates type with MM/dd/yyyy
                                    System.out.println("School: "+allUsersList.get(kj).getGraduateSchool());
                                    System.out.println("-----------------------------------------------------------");
                                }
                            }
                        }
                    }
                    else{ // if the user doesn't have any friend
                        System.out.println("You have not added any friend yet!");
                        System.out.println("-----------------------------------------------------------");
                    }
                }
            }
            if (list[0].equals("REMOVEFRIEND")) {
                if (signin[0] == -1) { // if no one entered the system
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 2) { // if the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 2 && allUsersList.get(signin[0]).getUsername().equals(list[1])) { //  if you tried to remove yourselves.
                    System.out.println("You cannot use your username!");
                }
                if (signin[0] != -1 && list.length == 2 && !allUsersList.get(signin[0]).getUsername().equals(list[1])) { // if command right and a user already signed in
                    if (allUsersList.get(signin[0]).getFriendsList().size() > 0) { // if the user already has some friends
                        if(allUsersList.get(signin[0]).getFriendsList().contains(list[1])){ // if the user already has that friend in his friends list
                            for(int ce=0 ; ce <allUsersList.get(signin[0]).getFriendsList().size();ce++){
                                if(allUsersList.get(signin[0]).getFriendsList().get(ce).equals(list[1])){ // in order to access that friend
                                    allUsersList.get(signin[0]).getFriendsList().remove(ce); // to remove that friend from his friends list
                                    System.out.println(list[1] +" has been successfully removed from your friend list.");
                                    System.out.println("-----------------------------------------------------------");
                                }
                            }
                        }
                        else{ // if the user doesn't have that user in his friends list
                            System.out.println("No such friend!");
                            System.out.println("-----------------------------------------------------------");
                        }
                    }

                    else { // if the user has not add ayn friend yet
                        System.out.println("You have not added any friend yet!");
                        System.out.println("-----------------------------------------------------------");
                    }
                }

            }

            if (list[0].equals("SHOWBLOCKEDFRIENDS")) {
                boolean blocked_friend = true;
                if (signin[0] == -1) { // if no one signed in yet.
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 1) { // if the command is not right
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 1) { // command true and someone signed in
                    if(allUsersList.get(signin[0]).getFriendsList().size()>0 && allUsersList.get(signin[0]).getBlockedList().size()>0){ // if the user has already blocked some friends
                        for(int dk=0 ; dk<allUsersList.get(signin[0]).getFriendsList().size();dk++){
                            if(allUsersList.get(signin[0]).getBlockedList().contains(allUsersList.get(signin[0]).getFriendsList().get(dk))){ // if the user blocked a friend
                                blocked_friend=false;
                                for (int check7 = 0; check7 < allUsersList.size(); check7++) {
                                    if(allUsersList.get(signin[0]).getFriendsList().get(dk).equals(allUsersList.get(check7).getUsername())){ // in order to access blocked friends information
                                        System.out.println("Name: " + allUsersList.get(check7).getName());
                                        System.out.println("Username: " + allUsersList.get(check7).getUsername());
                                        System.out.println("Date Of Birth: " + info.format(allUsersList.get(check7).getDateOfBirth())); // to change blocked friends biths with MM/dd/yyyy format
                                        System.out.println("School: " + allUsersList.get(check7).getGraduateSchool());
                                        System.out.println("------------------------------------------------------");
                                        blocked_friend = false;

                                    }
                                }

                            }
                            if(dk==(allUsersList.get(signin[0]).getFriendsList().size()-1) && blocked_friend==true){ // if the user blocked some user but they are not his friends.
                                System.out.println("You haven’t blocked any friend yet!");
                            }
                        }
                    }
                    else{ // if the user has not blocked ayn friend yet
                        System.out.println("You haven’t blocked any friend yet!");
                        System.out.println("-----------------------------------------------------------");
                    }
                }

            }
            if(list[0].equals("ADDPOST-TEXT")){
                if(signin[0]==-1){ // if no user signed in
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if(signin[0]!=-1 && list.length!=5){ //  if the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if(signin[0]!=-1 && list.length==5){ // command true and a user signed in
                    double longtiude= Double.valueOf(list[2]);
                    double latidue = Double.valueOf(list[3]);
                    Location location = new Location(longtiude,latidue); // to add a location
                    String [] username_split; // in order to split tagged users
                    String tag1=""; // in order to add tagged friends
                    username_split=list[4].split(":");// in order to split tagged users
                    for(int check1=0; check1<username_split.length;check1++){
                        boolean text = true;
                        if(allUsersList.get(signin[0]).getFriendsList().contains(username_split[check1])){ // if tagged user is a friend of the user.
                            text=false;
                            for(int check2=0;check2<allUsersList.size();check2++){
                                if(allUsersList.get(check2).getUsername().equals(username_split[check1])){ // in order to get tagged users Name
                                    tag1=tag1+allUsersList.get(check2).getName()+","; // in order to add tagged user

                                }
                            }
                        }
                        if(!allUsersList.get(signin[0]).getFriendsList().contains(username_split[check1])){ // if the tagged user is not a friend of the user signed in
                            System.out.println(username_split[check1]+" is not your friend, and will not be tagged!");
                        }
                        if(check1==(username_split.length-1) ){
                            AddText text2= new AddText(list[1],location,tag1,dates); // in order to add text post
                            allUsersList.get(signin[0]).getCollectionOfPosts().add(text2); // in order to add our textpost to our collection post
                            System.out.println("The post has been successfully added.");
                            System.out.println("-----------------------------------------------------------");
                        }

                    }

                }
            }

            if(list[0].equals("ADDPOST-VIDEO")) {
                if (signin[0] == -1) {  // if no one signed in
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 7) { // if the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 7) { // command true and a user signed in
                    double longtiude1 = Double.valueOf(list[2]);
                    double latidue1 = Double.valueOf(list[3]);
                    Location location = new Location(longtiude1, latidue1); // in oreder to add location
                    String[] video_split_tag;
                    String tag3 = ""; // in order to add tagged user
                    video_split_tag = list[4].split(":"); // in order to split tagged users
                    for (int check8 = 0; check8 < video_split_tag.length; check8++) {
                        boolean video_test = true;
                        if (allUsersList.get(signin[0]).getFriendsList().contains(video_split_tag[check8])) { // if tagged user a friend of the user signed in
                            video_test = false;
                            for (int check9 = 0; check9 < allUsersList.size(); check9++) {
                                if (allUsersList.get(check9).getUsername().equals(video_split_tag[check8])) { // in order to get tagged user's Name
                                    tag3 = tag3 + allUsersList.get(check9).getName() + ","; // in order to add tagged friend
                                }
                            }
                        }
                        if (!allUsersList.get(signin[0]).getFriendsList().contains(video_split_tag[check8])) { // if the tagge user is not a friend of the user signed in
                            System.out.println(video_split_tag[check8] + " is not your friend, and will not be tagged!");
                        }
                        if (check8 == (video_split_tag.length - 1)) {
                            AddVideo ad = new AddVideo(list[1], location, tag3, list[5], Double.valueOf(list[6]), dates);
                            if (ad.getVideoDuration() > ad.getConstant()) { // if the video duration bigger than constant duration value
                                System.out.println("Error: Your video exceeds maximum allowed duration of 10 minutes.");
                                System.out.println("-----------------------------------------------------------");
                                break;

                            } else { // if the video duration smaller or equal than constant video duration
                                allUsersList.get(signin[0]).getCollectionOfPosts().add(ad); // to add the video post the users post collection
                                System.out.println("The post has been successfully added.");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            }

                        }
                    }
                }

            }
            if (list[0].equals("ADDPOST-IMAGE")) {
                boolean image_check = true;
                if (signin[0] == -1) { // if no one signed in
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 7) { // if the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length == 7) { // if the command is true
                    double longtiude2 = Double.valueOf(list[2]);
                    double latidue2 = Double.valueOf(list[3]);
                    Location location = new Location(longtiude2, latidue2); // in order to add a location
                    String[] image_split_tag;
                    String tag4 = ""; // in order to add tagged friends
                    image_split_tag = list[4].split(":"); // in order to split the tagged users
                    for (int check10 = 0; check10 < image_split_tag.length; check10++) {
                        if (allUsersList.get(signin[0]).getFriendsList().contains(image_split_tag[check10])) { // if tagged user is a friend os the user signed in
                            for (int check11 = 0; check11 < allUsersList.size(); check11++) {
                                if (allUsersList.get(check11).getUsername().equals(image_split_tag[check10])) { // in order to get the tagged friends name
                                    tag4 = tag4 + allUsersList.get(check11).getName() + ","; // in order to add tagged friends
                                }
                            }
                        }
                        if (!allUsersList.get(signin[0]).getFriendsList().contains(image_split_tag[check10])) { // if the tagged user is not a friend of the user signed in
                            System.out.println(image_split_tag[check10] + " is not your friend, and will not be tagged!");
                        }
                        if (check10 == (image_split_tag.length - 1)) {
                            AddImage ac = new AddImage(list[1], location, tag4, list[5], list[6], dates);
                            allUsersList.get(signin[0]).getCollectionOfPosts().add(ac); // in order to add to post the user post collection
                            System.out.println("The post has been successfully added.");
                            System.out.println("-----------------------------------------------------------");
                            break;

                        }
                    }

                }
            }

            if (list[0].equals("SHOWPOSTS")) {
                boolean showpost=false;
                if (list.length != 2) { // if the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if (list.length == 2) { // command true
                    for (int x3 = 0; x3 < allUsersList.size(); x3++) {
                        if (allUsersList.get(x3).getUsername().equals(list[1])){ // in order to get the users name
                            System.out.println("***************************");
                            System.out.println(allUsersList.get(x3).getName()+"'s Posts");
                            System.out.println("***************************");
                            break;
                        }

                    }

                    for (int x2 = 0; x2 < allUsersList.size(); x2++) {
                        if (allUsersList.get(x2).getUsername().equals(list[1])) { // if we have that user in our system
                            showpost=true;
                            if(allUsersList.get(x2).getCollectionOfPosts().size()<=0){ // if the user haven't added any post yet
                                System.out.println(list[1] +" does not have any posts yet.");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            }
                            else{ // if the user has some posts
                                for(int op=0 ; op<allUsersList.get(x2).getCollectionOfPosts().size();op++){ // in order to get users posts
                                    if(allUsersList.get(x2).getCollectionOfPosts().get(op) instanceof AddText){ // if the post belong to AddText class
                                        if(((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getTag().equals("")){ // if the user's post doesn't have any tagged friend
                                            System.out.println(((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getText());
                                            System.out.println("Date: "+info.format(((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getX()));
                                            System.out.println("Location: "+((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getY()+","+((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getX());
                                            System.out.println("-----------------------------------------------------------");
                                        }
                                        else { // if the users post have some tagged friend
                                            System.out.println(((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getText());
                                            System.out.println("Date: "+info.format(((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getX()));
                                            System.out.println("Location: " + ((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getY() + "," + ((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getX());
                                            System.out.println("Friends tagged in this post: " + ((AddText) allUsersList.get(x2).getCollectionOfPosts().get(op)).getTag());
                                            System.out.println("-----------------------------------------------------------");
                                        }
                                    }
                                    if(allUsersList.get(x2).getCollectionOfPosts().get(op) instanceof AddImage){ // if the post belongs to AddImage class
                                        if(((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getTag().equals("")){ //if the user's post doesn't have any tagged friend
                                            System.out.println(((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getText());
                                            System.out.println("Date: "+info.format(((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getX()));
                                            System.out.println("Location: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getY()+","+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getX());
                                            System.out.println("Image: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getFilePath());
                                            System.out.println("Image resolution: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getResolution());
                                            System.out.println("-----------------------------------------------------------");
                                        }
                                        else{ // if the post has some tagged friends
                                            System.out.println(((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getText());
                                            System.out.println("Date: "+info.format(((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getX()));
                                            System.out.println("Location: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getY()+","+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getX());
                                            System.out.println("Friends tagged in this post: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getTag());
                                            System.out.println("Image: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getFilePath());
                                            System.out.println("Image resolution: "+((AddImage) allUsersList.get(x2).getCollectionOfPosts().get(op)).getResolution());
                                            System.out.println("-----------------------------------------------------------");
                                        }

                                    }
                                    if(allUsersList.get(x2).getCollectionOfPosts().get(op) instanceof AddVideo){ // if the users post belongs to AddVideo class
                                        if(((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getTag().equals("")){ // if the post doesn't have tagged friends
                                            System.out.println(((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getText());
                                            System.out.println("Date: "+info.format(((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getX()));
                                            System.out.println("Location: "+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getY()+","+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getX());
                                            System.out.println("Video: "+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getFilePath());
                                            System.out.println("Video duration: "+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getVideoDuration()+" minutes.");
                                            System.out.println("-----------------------------------------------------------");
                                        }
                                        else{ // if the post has some tagged friends
                                            System.out.println(((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getText());
                                            System.out.println("Date: "+info.format(((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getX()));
                                            System.out.println("Location: "+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getY()+","+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getLocation().getX());
                                            System.out.println("Friends tagged in this post: " +((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getTag());
                                            System.out.println("Video: "+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getFilePath());
                                            System.out.println("Video duration: "+((AddVideo) allUsersList.get(x2).getCollectionOfPosts().get(op)).getVideoDuration()+" minutes.");
                                            System.out.println("-----------------------------------------------------------");
                                        }
                                    }
                                }
                            }
                        }
                        if(x2==(allUsersList.size()-1) && showpost==false){
                            System.out.println("No such user!");
                            System.out.println("-----------------------------------------------------------");
                        }
                    }
                }
            }
            if(list[0].equals("REMOVELASTPOST")){
                if(signin[0]==-1) { // if no one signed in
                    System.out.println("Error: Please sign in and try again.");
                    System.out.println("-----------------------------------------------------------");
                }
                if (signin[0] != -1 && list.length != 1) { // if the command is false
                    System.out.println("The command is not readable!");
                    System.out.println("-----------------------------------------------------------");
                }
                if(signin[0]!=-1 && list.length==1){ // if the command true and a  signed in
                    if(allUsersList.get(signin[0]).getCollectionOfPosts().size()>0){ // in order to get the users posts size
                        int bv= (allUsersList.get(signin[0]).getCollectionOfPosts().size() -1);
                        allUsersList.get(signin[0]).getCollectionOfPosts().remove(bv); // to remove the last post
                        System.out.println("Your last post has been successfully removed.");
                        System.out.println("-----------------------------------------------------------");
                    }
                    else{ // if the user doesn't have any post yet
                        System.out.println("Error: You do not have any post.");
                        System.out.println("-----------------------------------------------------------");
                    }
                }
            }

        }


    }
}
