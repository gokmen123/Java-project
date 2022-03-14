import java.text.SimpleDateFormat;
import java.util.Date;

public class AddText extends Posts{

    private String text;

    public AddText(String text, Location location, String tag, Date x) {
        super(location, tag, x);
        this.text=text;

    }



    public String getText() {
        return text;
    }

    public String showAllText(){
        return getText()+","+getLocation().getX()+","+getLocation().getY()+","+getTag()+","+getX();
    }
}
