package ac.upm.pharmacy.service.impl;

import ac.upm.pharmacy.exception.ProductDuplicatedException;
import ac.upm.pharmacy.exception.ProductNotFoundException;
import ac.upm.pharmacy.repository.ProductRepository;
import ac.upm.pharmacy.service.ProductService;
import org.springframework.stereotype.Service;
import ac.upm.pharmacy.model.Product;
import java.util.List;
import lombok.Data;

@Service
@Data
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    @Override
    public Product save(Product product) throws ProductDuplicatedException {
        Product productFromDB = productRepository.findById(product.getId()).orElse(null);
        if (productFromDB != null)
            throw new ProductDuplicatedException(product.getId());
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) throws ProductNotFoundException {
        Product productFromDB = productRepository.findById(product.getId()).orElse(null);
        if (productFromDB == null)
            throw new ProductNotFoundException(product.getId());
        product.setId(productFromDB.getId());
        return productRepository.save(product);
    }

    @Override
    public Long delete(Long id) throws ProductNotFoundException {
        Product productFromDB = productRepository.findById(id).orElse(null);
        if (productFromDB == null)
            throw new ProductNotFoundException(id);
        productRepository.delete(productFromDB);
        return id;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

//
//    public Product receiveProduct(Product product) {
//        return productRepository.save((product));
//    }

//    public Product receiveProduct(Product product){
//       return ProductRepository.save(product);
//    }

//    public  ProductServiceImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public Product save(Product person) {
//        return productRepository.save(person);
//    }

//    @Override
//    public Product save(Product product) {
//        return product;
//    }


//had l3iba khedama
//    @Override
//    public Product receiveProduct(Product product) {
//        product.setDescription(product.getDescription()+" HAHAHA");
//        return product;
//    }



}
