package ie.atu.week2_refresherlab;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Positive(message = "ID must be greater than 0")
    private Long id;

    @NotBlank(message = "Product name cannot be blank")
    private String name;

    @Positive(message = "Price must be greater than 0")
    private double price;

    @Positive(message = "Stock must be a positive number")
    private int stock;
}