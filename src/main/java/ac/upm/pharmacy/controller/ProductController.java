package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.controller.dto.ProductDto;
import ac.upm.pharmacy.converter.ProductConverter;
import ac.upm.pharmacy.service.ProductService;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("product")
@Data
public class ProductController {

    final ProductService productService;
    final ProductConverter productConverter;



    //    @GetMapping("/")
//    public ResponseEntity<List<Product>> findAll() {
//        return ResponseEntity.status(HttpStatus.OK).body(ProductService.findAll());
//    }

//    @PostMapping("/")
//    public Product receiveProduct(@RequestBody Product product){
//        return product;
//    }


//    @Autowired
//    @PostMapping("/")
//    public Product receiveProduct(@RequestBody Product product){
//        return productService.receiveProduct(product);
//    }

    @PostMapping("/")
    public ResponseEntity<?> save(@Valid @RequestBody ProductDto productDTO) throws Exception {
        if (productDTO == null)
            return ResponseEntity.badRequest().body("The provided product is not valid");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productConverter.convertToDTO(productService.save(productConverter.convertToDM(productDTO))));
    }

    @PutMapping("/")
    public ResponseEntity<?> update(@Valid @RequestBody ProductDto productDTO) throws Exception {
        if (productDTO == null)
            return ResponseEntity.badRequest().body("The provided product is not valid");
        return ResponseEntity
                .ok()
                .body(productConverter.convertToDTO(productService.update(productConverter.convertToDM(productDTO))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
        if (id == null)
            return ResponseEntity.badRequest().body("The provided product's id is not valid");
        return ResponseEntity.ok().body("Product [" + productService.delete(id) + "] deleted successfully.");
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductDto>> findAll() {
        return ResponseEntity.ok().body(productConverter.convertToDTOs(productService.findAll()));
    }
}
