package ac.upm.pharmacy.model;


import lombok.Data;

import javax.persistence.*;

//@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Embedded
    private Info info;




}
