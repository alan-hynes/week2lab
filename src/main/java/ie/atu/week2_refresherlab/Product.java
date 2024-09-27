package ie.atu.week2_refresherlab;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotNull
    private Long id;
    @NotNull
    private String name;
    @Positive(message = "Price must be more than 0")
    private double price;
}