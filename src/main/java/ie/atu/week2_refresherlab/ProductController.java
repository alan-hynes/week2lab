package ie.atu.week2_refresherlab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProductlist()
    {
        return "";
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        return product;
    }
}
