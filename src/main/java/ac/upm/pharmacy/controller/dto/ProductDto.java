package ac.upm.pharmacy.controller.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ProductDto {

    @NotNull
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String description;

    @Min(value = 0, message = "Error price")
    @NotNull
    @NotBlank
    private Double price;

    @NotBlank
    private Boolean perscription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getPerscription() {
        return perscription;
    }

    public void setPerscription(Boolean perscription) {
        this.perscription = perscription;
    }




}
