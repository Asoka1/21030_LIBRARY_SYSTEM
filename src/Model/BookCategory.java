
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author asoka
 */
@Entity
public class BookCategory {
    @Id
 private int catid;
    private String catname;

    public BookCategory() {
    }

    public BookCategory(int catid, String catname) {
        this.catid = catid;
        this.catname = catname;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
    
}
