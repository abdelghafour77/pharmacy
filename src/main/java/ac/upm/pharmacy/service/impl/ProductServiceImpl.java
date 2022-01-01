package ac.upm.pharmacy.service.impl;

import ac.upm.pharmacy.model.Product;
import ac.upm.pharmacy.repository.ProductRepository;
import ac.upm.pharmacy.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
//
//    @Override
//    public Product save(Product person) {
//        return productRepository.save(person);
//    }

    @Override
    public Product save(Product product) {
        return null;
    }

//    @Override
//    public List<Product> findAll() {
//        return null;
//    }

}
