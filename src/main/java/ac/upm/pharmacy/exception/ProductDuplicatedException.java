package ac.upm.pharmacy.exception;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class ProductDuplicatedException extends Exception {
    private Long mid;
}
