package src;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author abdel
 */
@Entity
//@DiscriminatorValue("subofPro")
public class HeadSer extends ProBooks{
    private String pic;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    
    
}
