package src;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author abdel
 */
@Entity
//@DiscriminatorValue("subofBooks")
public class ProBooks extends Books{
    private String lan;

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }
    
    
}
