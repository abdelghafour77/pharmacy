package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.model.Product;
import ac.upm.pharmacy.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
@AllArgsConstructor
@Slf4j
public class ProductController {
//    @GetMapping("/")
//    public ResponseEntity<List<Product>> findAll() {
//        return ResponseEntity.status(HttpStatus.OK).body(ProductService.findAll());
//    }
}
