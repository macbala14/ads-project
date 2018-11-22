package pl.adsproject.db.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.adsproject.db.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findByProductId(Integer productId);

}

