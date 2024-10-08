package ie.atu.week2_refresherlab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    private final List<Product> productList = new ArrayList<>();

    public List<Product>getAllProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product editProduct(Long id, Product product) {
        for (Product prod : productList) {
            if (prod.getId().equals(id)) {
                prod.setName(product.getName());
                prod.setPrice(product.getPrice());
                prod.setStock(product.getStock());
                return prod;
            }
        }
        throw new IllegalArgumentException("No product with id " + product.getId() + " found");
    }

    public void deleteProduct(Long id) {
        productList.removeIf(prod -> Objects.equals(prod.getId(), (long) id));
    }

    public Product getProductByID(Long id) {
        return productList.stream()
                .filter(product -> Objects.equals(product.getId(), id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Product with ID" + id + " not found"));
    }
}
