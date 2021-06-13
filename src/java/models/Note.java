
package models;

import java.io.Serializable;

/**
 *
 * @author 840979
 */
public class Note implements Serializable{
    private String contents;
    private String title;

    public Note() {
        contents ="";
        title ="";
    }

    public Note(String contents, String title) {
        this.contents = contents;
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
    
}
