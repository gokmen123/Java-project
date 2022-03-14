import java.text.SimpleDateFormat;
import java.util.Date;

public class Posts {
    private Location location;
    private String  tag;
    private  Date x;


    public Posts(Location location, String tag, Date x) {
        this.location = location;
        this.tag = tag;
        this.x = x;

    }

    public Location getLocation() {
        return location;
    }

    public String getTag() {
        return tag;
    }

    public Date getX() {
        return x;
    }


    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setX(Date x) {
        this.x = x;
    }

}
