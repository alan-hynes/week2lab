package ie.atu.week2_refresherlab;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProductlist()
    {
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public Product addProduct(@Valid @RequestBody Product product)
    {

        return productService.addProduct(product);
    }

    @PutMapping("/edit/{id}")
    public Product editProduct(@PathVariable Long id, @Valid @RequestBody Product product)
    {
        return productService.editProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {

        productService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductByID(id);
    }

}
