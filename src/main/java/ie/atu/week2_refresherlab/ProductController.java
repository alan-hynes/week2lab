package ie.atu.week2_refresherlab;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductService service;
    private Object product;

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

    @GetMapping("/stock/{productId}")
    public boolean checkStock(@PathVariable Long productId) {
        service.getProductByID(productId);
        return product.getStock() > 0;
    }

}
