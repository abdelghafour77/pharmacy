package ac.upm.pharmacy.model;

import javax.persistence.Embeddable;

@Embeddable
public class Info {

    private String name;
    private String description;
    private Double price;
    private Boolean perscription;
}
