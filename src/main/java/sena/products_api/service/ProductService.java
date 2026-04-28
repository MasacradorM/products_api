package sena.products_api.service;

import sena.products_api.entity.Product;
import sena.products_api.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> findAll() { return repo.findAll(); }
    public Optional<Product> findById(Long id) { return repo.findById(id); }
    public Product save(Product product) { return repo.save(product); }
    public void delete(Long id) { repo.deleteById(id); }
}