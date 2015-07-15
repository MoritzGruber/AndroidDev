package teamtreehouse.com.interactivestory.model;

/**
 * Created by Unantastbar on 14.07.2015.
 */
public class Choice {
    private String mText;
    private int  mImageId;

    public Choice(String text, int imageId) {
        mText = text;
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
