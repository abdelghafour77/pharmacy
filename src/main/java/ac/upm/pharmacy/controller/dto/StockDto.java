package ac.upm.pharmacy.controller.dto;

import javax.validation.constraints.*;
import java.util.Date;
import lombok.Data;

@Data
public class StockDto {

        @NotNull
        private Long id;

        @NotNull
        @NotBlank
        private String reference;

        @NotNull
        @NotBlank
        private Integer quantity;

        @NotNull
        @NotBlank
        private Date exp_date;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getReference() {
                return reference;
        }

        public void setReference(String reference) {
                this.reference = reference;
        }

        public Integer getQuantity() {
                return quantity;
        }

        public void setQuantity(Integer quantity) {
                this.quantity = quantity;
        }

        public Date getExp_date() {
                return exp_date;
        }

        public void setExp_date(Date exp_date) {
                this.exp_date = exp_date;
        }
}
