import java.util.Date;

public class AddVideo extends  Posts{
    private String filePath;
    private double videoDuration;
    private String text;
    final int constant=10;

    public String getText() {
        return text;
    }



    public AddVideo(String text, Location location, String tag, String filePath, double videoDuration, Date x) {
        super(location, tag, x);
        this.filePath=filePath;
        this.videoDuration=videoDuration;
        this.text=text;
    }

    public String getFilePath() {
        return filePath;
    }

    public double getVideoDuration() {
        return videoDuration;
    }

    public void setFilePath(String filePath) {
        this.filePath=filePath;
    }
    public final int getConstant() {
        return constant;
    }

    public void setVideoDuration(int videoDuration) {
        this.videoDuration=videoDuration;
    }
    public String showAllVideo(){
        return getText()+","+getLocation().getX()+","+getLocation().getY()+","+getTag()+","+filePath+","+videoDuration+","+getX();
    }
}
