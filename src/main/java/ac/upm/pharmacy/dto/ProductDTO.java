package ac.upm.pharmacy.dto;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class ProductDTO {

    @NotNull
    private Long id;

    private String name;

    private String description;

    private Double price;

    private Boolean state;


}
