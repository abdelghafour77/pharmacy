package ac.upm.pharmacy.service.impl;

import ac.upm.pharmacy.model.Product;
import ac.upm.pharmacy.repository.ProductRepository;
import ac.upm.pharmacy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product receiveProduct(Product product) {
        return productRepository.save((product));
    }

//    public Product receiveProduct(Product product){
//       return ProductRepository.save(product);
//    }

    public  ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
//
//    @Override
//    public Product save(Product person) {
//        return productRepository.save(person);
//    }

    @Override
    public Product save(Product product) {
        return product;
    }


//had l3iba khedama
//    @Override
//    public Product receiveProduct(Product product) {
//        product.setDescription(product.getDescription()+" HAHAHA");
//        return product;
//    }



//    @Override
//    public List<Product> findAll() {
//        return null;
//    }

}
