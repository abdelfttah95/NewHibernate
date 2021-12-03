package src;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

/**
 *
 * @author abdel
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "inherType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("parent")
public class Books {
    private int id;
    private int isb;

@Id
@TableGenerator(allocationSize = 1, name = "id")
@GeneratedValue(strategy = GenerationType.TABLE, generator = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsb() {
        return isb;
    }

    public void setIsb(int isb) {
        this.isb = isb;
    }
    
    
}
