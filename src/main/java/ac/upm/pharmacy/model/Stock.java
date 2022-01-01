package ac.upm.pharmacy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String Reference;
    private Integer Quantity;
    private Date Exp_date;

    public  Long getId() {
        return id;
    }

    public String getReference() {
        return Reference;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public Date getExp_date() {
        return Exp_date;
    }
}
