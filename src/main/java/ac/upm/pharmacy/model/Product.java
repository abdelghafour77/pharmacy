package ac.upm.pharmacy.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;


    private String name;
    private String description;
    private Double price;
    private Boolean state=false;


}
