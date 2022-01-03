package ac.upm.pharmacy.service;

import ac.upm.pharmacy.exception.ProductDuplicatedException;
import ac.upm.pharmacy.exception.ProductNotFoundException;
import ac.upm.pharmacy.model.Product;

import java.util.List;

public interface ProductService {


  Product save(Product product) throws ProductDuplicatedException;

  Product update(Product product)throws ProductNotFoundException;

  Long delete(Long id)throws ProductNotFoundException;

  List<Product> findAll();

}

