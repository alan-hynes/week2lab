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

    public Product editProduct(Product product) {
        for (Product prod : productList) {
            if (prod.getId().equals(product.getId())) {
                prod.setName(product.getName());
                prod.setPrice(product.getPrice());
                return prod;
            }
        }
        throw new IllegalArgumentException("No product with id " + product.getId() + " found");
    }

    public void deleteProduct(int id) {
        productList.removeIf(prod -> Objects.equals(prod.getId(), (long) id));
    }
}
