package ie.atu.week2_refresherlab;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;

    @Autowired
    public ProductController(ProductService service)
    {
        this.service = service;
    }

    @GetMapping("/product")
    public List<Product> getProductlist()
    {

        return service.getAllProducts();
    }

    @PostMapping("/product")
    public Product addProduct(@Valid @RequestBody Product product)
    {
        return service.addProduct(product);
    }

    @PutMapping("/product")
    public Product editProduct(@Valid @RequestBody Product product)
    {
        return service.editProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
    }
}
