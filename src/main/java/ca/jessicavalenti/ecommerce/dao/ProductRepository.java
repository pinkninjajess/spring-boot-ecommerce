package ca.jessicavalenti.ecommerce.dao;

import ca.jessicavalenti.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
