import java.text.SimpleDateFormat;
import java.util.Date;

public class AddImage extends Posts{
    private String filePath;
    private String resolution;
    private String text;
    public AddImage(String text,Location location, String tag,String filePath,String resolution, Date x) {
        super(location, tag, x);
        this.filePath=filePath;
        this.resolution=resolution;
        this.text=text;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getResolution() {
        return resolution;
    }

    public String getText() {
        return text;
    }
    public String getAllImage(){
        return text+getLocation()+","+getTag()+","+filePath+","+resolution+","+getX();
    }
}
