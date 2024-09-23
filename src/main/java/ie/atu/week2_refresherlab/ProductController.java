package ie.atu.week2_refresherlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService service;
    @Autowired
    ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProductlist()
    {
        return service.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        service.addProduct(product);
        return product;
    }
}
