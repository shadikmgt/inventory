package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;
    private String brandName;
    private String productName;
    private String barCode;
    private Integer purchasePrice;
    private Integer salesPrice;
    private String description;

//    private Category categoryName;
//    private Brand brandName;

}
