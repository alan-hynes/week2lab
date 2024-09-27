package ie.atu.week2_refresherlab;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @Positive(message = "Price must be more than 0")
    private double price;
}