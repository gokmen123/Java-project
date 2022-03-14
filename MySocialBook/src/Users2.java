import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Users2 {
    private int Id;
    private String name;
    private String username;
    private String password;
    private Date dateOfBirth;
    private String graduateSchool;
    private ArrayList<String> blockedList= new ArrayList<>();
    private ArrayList<String> friendsList= new ArrayList<>();
    private ArrayList<Object> collectionOfPosts;
    private ArrayList<Date> lastLogIn;
    SimpleDateFormat simple_date=new SimpleDateFormat("MM/dd/yyyy");

    public Users2(int id, String name, String username, String password, Date dateOfBirth, String graduateSchool, ArrayList<String> blockedList, ArrayList<String> friendsList,
                  ArrayList<Object> collectionOfPosts, ArrayList<Date> lastLogIn) {
        Id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.graduateSchool = graduateSchool;
        this.friendsList=friendsList;
        this.blockedList= blockedList;
        this.collectionOfPosts=collectionOfPosts;
        this.lastLogIn=lastLogIn;

    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public ArrayList<Date> getLastLogIn() {
        return lastLogIn;
    }

    public void setLastLogIn(Date k) {
        this.lastLogIn.set(0,k);
    }

    public String getAllInfo(){
        return Id+","+name +","+username+","+password+","+dateOfBirth+","+graduateSchool+","+blockedList+","+friendsList+","+collectionOfPosts+","+lastLogIn;
    }
    public ArrayList<String> getBlockedList() {
        return blockedList;
    }

    public void setBlockedList(ArrayList<String> blockedList) {
        this.blockedList = blockedList;
    }

    public ArrayList<String> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(ArrayList<String> friendsList) {
        this.friendsList = friendsList;
    }

    public ArrayList<Object> getCollectionOfPosts() {
        return collectionOfPosts;
    }

    public void setCollectionOfPosts(ArrayList<Object> collectionOfPosts) {
        this.collectionOfPosts = collectionOfPosts;
    }
}
