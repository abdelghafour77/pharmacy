package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.model.Product;
import ac.upm.pharmacy.service.ProductService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("product")

public class ProductController {
//    @GetMapping("/")
//    public ResponseEntity<List<Product>> findAll() {
//        return ResponseEntity.status(HttpStatus.OK).body(ProductService.findAll());
//    }
}
