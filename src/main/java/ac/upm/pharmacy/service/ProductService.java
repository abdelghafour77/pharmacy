package ac.upm.pharmacy.service;

import ac.upm.pharmacy.model.Product;

public interface ProductService {

    Product save(Product product);

    public Product receiveProduct(Product product);

//    Product update(Product product) throws Exception;
//
//    Long delete(Long id) throws Exception;
//
//    List<Product> findAll();

}

