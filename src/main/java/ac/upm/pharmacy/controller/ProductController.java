package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.converter.ProductConverter;
import ac.upm.pharmacy.dto.ProductDTO;
import ac.upm.pharmacy.model.Product;
import ac.upm.pharmacy.service.ProductService;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("product")
@Data
public class ProductController {
    final ProductService productService;
    final ProductConverter productConverter;
    @PostMapping("/")
    public ResponseEntity<?> save(@Valid @RequestBody ProductDTO productDTO) throws Exception {
        if (productDTO == null)
            return ResponseEntity.badRequest().body("The provided product is not valid");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productConverter.convertToDTO(productService.save(productConverter.convertToDM(productDTO))));
    }

    @PutMapping("/")
    public ResponseEntity<?> update(@Valid @RequestBody ProductDTO productDTO) throws Exception {
        if (productDTO == null)
            return ResponseEntity.badRequest().body("The provided product is not valid");
        return ResponseEntity
                .ok()
                .body(productConverter.convertToDTO(productService.update(productConverter.convertToDM(productDTO))));
    }


    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) throws Exception {
        if (id == null){
             ResponseEntity.badRequest().body("The provided product's id is not valid");
        return"redirect:/product/";
        }
         ResponseEntity.ok().body("Product [" + productService.delete(id) + "] deleted successfully.");
        return"redirect:/product/";
    }
    @GetMapping("/")
    public String findAll(Model model) {
        List<Product> product=(List<Product>) productService.findAll();
        model.addAttribute("products",product);

        return "product";
    }

    //    @RequestMapping("/new")
//    public String newProduct(Model model)
//    {
//       Product product=new Product();
//      model.addAttribute("products", product);
//        return "new_product";
//    }

//    @RequestMapping("/edit/{id}")
//    public ResponseEntity<?> update(@Valid @RequestBody ProductDTO productDTO) throws Exception {
//        if (productDTO == null)
//            return ResponseEntity.badRequest().body("The provided product is not valid");
//        return ResponseEntity
//                .ok()
//                .body(productConverter.convertToDTO(productService.update(productConverter.convertToDM(productDTO))));
//    }
//    @GetMapping("/")
//    public ResponseEntity<List<ProductDTO>> findAll() {
//        return ResponseEntity.ok().body(productConverter.convertToDTOs(productService.findAll()));
//    }
}
