package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.model.Product;
import ac.upm.pharmacy.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("product")
public class ProductController {
//    @GetMapping("/")
//    public ResponseEntity<List<Product>> findAll() {
//        return ResponseEntity.status(HttpStatus.OK).body(ProductService.findAll());
//    }
    @GetMapping("/")
    public String receiveProduct(){
        return "hello";
    }

//    @PostMapping("/")
//    public Product receiveProduct(@RequestBody Product product){
//        return product;
//    }


    @Autowired
    ProductService productService;

    @PostMapping("/")
    public Product receiveProduct(@RequestBody Product product){
        return productService.receiveProduct(product);
    }
}
